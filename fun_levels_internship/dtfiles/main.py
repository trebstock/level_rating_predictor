from sklearn.svm._libsvm import predict
from one_hot_encoder import *
from functions import *
from parse_ratings import level_to_fun_value
from sklearn import tree
import numpy
import matplotlib.pyplot as plt
import seaborn
import pickle
from joblib import dump, load
import os

# names of all the files in the data set
all_files = ["MarioLevel.java", "TestLevelB1.java", "TestLevelB8.java", "TestLevelB9.java", "TestLevelB11.java",
             "TestLevelB13.java", "TestLevelC0.java", "TestLevelC5.java", "TestLevelC13.java", "TestLevelC14.java",
             "TestLevelC16.java", "TestLevelD1.java", "TestLevelD2.java", "TestLevelD6.java", "TestLevelD8.java",
             "TestLevelD10.java", "Level11Single.cs", "Level22Single.cs", "Level23Single.cs", "Level33Script.cs"]

# not all the block names match up, so this makes them match up
conversions = {
    "TUBE_TOP_LEFT": "PIPE_BODY_LEFT",
    "TUBE_TOP_RIGHT": "PIPE_BODY_RIGHT",
    "TUBE_SIDE_LEFT": "PIPE_TOP_LEFT",
    "TUBE_SIDE_RIGHT": "PIPE_TOP_RIGHT",
    "HILL_TOP": "HILLTOP"
}

# empty lists
all_levels = []
all_ratings = []
sliding_window = []

# standard dimensions for every mario level
width_level = 382
height_level = 15
# total number of item types
no_of_zeros = 31
# customizable size of sliced window
window_size = 3
# size of padding around level (this is needed so sliced windows can be centered)
padding_width = (window_size - 1) // 2
number_of_files = 20
# process to make blank tile (1 at the end of the 1 hot encoding)
blank_tile = [0] * no_of_zeros
blank_tile[-2] = 1
# process to make padding tile (1 at the end of the 1 hot encoding)
padding = [0] * no_of_zeros
padding[-1] = 1

# goes through each file in dataset
for file in range(len(all_files)):
    # dictionary with blocks and their coordinates
    coord_to_block = {}
    current_file = all_files[file]
    # for csharp files
    if ".cs" in current_file:
        is_cs = True
        data = open("C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/Levels/" + current_file, 'r',
                    encoding='windows-1252')
        data_in_lines = data.readlines()
    # for java files
    elif ".java" in current_file:
        is_cs = False
        data = open("C:/Users/teres/Internship/HIP Mario/MarioPCGStudy/MarioPCGStudy/LevelsFromStudy/" + current_file, 'r',
                    encoding='windows-1252')
        data_in_lines = data.readlines()

    # blocks.txt is a list with all the block types
    with open('blocks.txt', 'r') as blocks_txt:
        items_all = blocks_txt.readlines()

    # highest.txt is a text file to find the highest possible dimensions in all levels
    with open('highest.txt', 'r') as highest_txt:
        highest_lines = highest_txt.readlines()
        latest_line = (highest_lines[-1:])
        latest_line = latest_line[0]
        highest_list = latest_line.replace("[", "").replace("]", "").replace("'", "").replace("\n", "").split(",")
        highest_list = [int(item) for item in highest_list]

    ranges = dict()

    # parses level csv and adds parsed data to a text file
    with open('level_data.txt', 'w') as data_txt:
        for iteration, line in enumerate(data_in_lines):
            # criteria for whether to parse line for data
            if ("etSprite") in line and not item_in_line(["x,", "y,", "i,", "[][]"], line):
                # for the cs files
                if is_cs:
                    multi_use(current_item, line, items_all, data_txt, highest_list, coord_to_block)

                elif not is_cs:
                    current_item = (get_sprite_type_java(line))

            # BLOCKS
            # basically functions the same as the sprite section
            if ("etBlock" in line) and not item_in_line(["x", "y", "i", "byte"], line):
                if is_cs:
                    current_item = get_block_sprite_type_cs(line)
                    multi_use(current_item, line, items_all, data_txt, highest_list, coord_to_block)

                elif not is_cs:
                    current_item = (get_block_type_java(line))
                    if current_item in conversions:
                        current_item = conversions.get(current_item)

                    multi_use(current_item, line, items_all, data_txt, highest_list, coord_to_block)

            # FOR LOOPS
            if "for (int" in line and is_cs:
                # convert line into a list with the range of the loop
                break_for_loop_into_range(line, ranges)

                next_line_num = iteration + 1
                next_line = data_in_lines[next_line_num]

            if "SetBlock" in line and is_cs:

                current_item = get_block_sprite_type_cs(line)

                item_inventory(current_item, items_all)
                coord = get_coordinates_cs(line)

                x_list = None
                y_list = None

                # check if first coordinate is a variable
                # if so, make x equal to the list of all the values of x
                if type(coord[0]) == str:
                    x_list = ranges[coord[0]]
                # if not, just make it equal to what it was before
                else:
                    x_list = [coord[0]]
                # SAME THING AS WITH X BEFORE
                if type(coord[1]) == str:
                    y_list = ranges[coord[1]]
                else:
                    y_list = [coord[1]]

                for x in x_list:
                    for y in y_list:
                        coord_to_block[(x, y)] = current_item
                        get_highest(x, y, highest_list)
                        # for that weird if statement in line 155 of the script
                        if iteration == 157:
                            coord_to_block[(x, 6)] = "GROUNDBOTTOM"
                            get_highest(x, 6, highest_list)

    data_txt.close()

    level = [list([None for x in range(height_level)]) for y in range(width_level)]

    translations = block_label_to_tuple_dict()

    # print_map(level, translations, dictionary_um)

    # makes level one-hot encoded
    for x in range(len(level)):
        for y in range(len(level[0])):
            # if block is in dictionary coord_to_block,
            if (x, y) in coord_to_block.keys():

                chars = len(coord_to_block[(x, y)])

                level[x][y] = translations[coord_to_block[(x, y)]]
            else:

                level[x][y] = blank_tile

    # make padding around level so that sliding windows can be centered
    for i in range(padding_width):
        # padding at top and bottom
        level.insert(0, [padding] * (height_level + i * 2))
        level.append([padding] * (height_level + i * 2))

        # padding at the sides
        for j in range(len(level)):
            level[j].insert(0, padding)
            level[j].append(padding)

    # make level a numpy array and add to collection of levels
    level = numpy.asarray(level)
    all_levels.append(level)

    # slice level into sliding windows
    for i in range(0, level.shape[1] - window_size + 1):
        for j in range(0, level.shape[0] - window_size + 1):
            window = level[j:j + window_size, i:i + window_size]  # each individual window
            sliding_window.append(window)

    numpy.set_printoptions(threshold=numpy.inf)

    result = numpy.hstack(level)

    all_ratings.append(level_to_fun_value().get(current_file))

# make ALL of the ratings floats (there was a mixture of ints and floats)
for i in range(len(all_ratings)):
    all_ratings[i] = float(all_ratings[i])

# there are more sliding windows than fun ratings so the number of fun values needed to be increased
n = (width_level) * (height_level)
all_ratings = numpy.repeat(all_ratings, n)

# reshapes sliding window so it can be used in decision tree
sliding_window = numpy.asarray(sliding_window)
sliding_window = sliding_window.reshape(n * number_of_files, -1)

# make X and y for the decision tree equal to the sliding windows and their corresponding values

# (uncomment if you want to change something -- takes a lot of time to process so I pickled it)

# X, y = sliding_window, all_ratings
#
# clf = tree.DecisionTreeRegressor(max_depth=25)
# clf = clf.fit(X, y)

# IMPORTANT!!! pickled the following -- uncomment if wanting to change something
# the "pickle.joblib" series are all pickled decision trees. the number that comes after is the windowsize
# for that decision tree

# dump(clf, 'pickle.joblib' + str(window_size))

# dump(all_levels, 'pickle.all_levels')
# dump(sliding_window, 'pickle.sliding_window')
# dump(all_ratings, 'pickle.all_ratings')

clf = load("pickle.joblib" + str(window_size))

# all_levels = load('pickle.all_levels')
# sliding_window = load('pickle.sliding_window')
# all_ratings = load('pickle.all_ratings')


# text representation of decision tree
text_representation = tree.export_text(clf)
with open('dt_in_txt.txt', 'w') as dt_in_txt:
    dt_in_txt.write(text_representation)


predicted_values = []

# predict the fun value of every decision tree in a level
# change the range to access different levels. ie: (2, 3) would be accessing the third level, TestLevelB8
for k in range(2, 3):
    level = all_levels[k]
    for i in range(0, height_level):
        predicted_values.append([])
        for j in range(0, width_level):
            window = level[j: j + window_size, i:i + window_size]  # each individual window
            window = numpy.asarray(window)
            window = window.reshape(1, -1)
            predicted_value = clf.predict(window)[0]
            predicted_values[i].append(predicted_value)

predicted_values = numpy.asarray(predicted_values)

# use these paramaters if you just want the heat map and none of the labels
# , cbar=False, xticklabels=False, yticklabels=False

# make heatmap, save it as a jpg, and then show on screen
seaborn.heatmap(predicted_values, square=True)
plt.savefig("C:/Users/teres/Internship/HIP Mario/decision tree graph/3Heatmap - B8.jpg", dpi=3000)
plt.show()
