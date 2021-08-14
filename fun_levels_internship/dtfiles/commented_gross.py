# https://stackoverflow.com/questions/3368969/find-string-between-two-substrings
from sklearn.svm._libsvm import predict

from one_hot_encoder import *
from functions import *
from parse_ratings import level_to_fun_value
from sklearn import tree
import numpy
import matplotlib.pyplot as plt
import seaborn
from joblib import dump, load

all_files = ["MarioLevel.java", "TestLevelB1.java", "TestLevelB8.java", "TestLevelB9.java", "TestLevelB11.java",
             "TestLevelB13.java", "TestLevelC0.java", "TestLevelC5.java", "TestLevelC13.java", "TestLevelC14.java",
             "TestLevelC16.java", "TestLevelD1.java", "TestLevelD2.java", "TestLevelD6.java", "TestLevelD8.java",
             "TestLevelD10.java", "Level11Single.cs", "Level22Single.cs", "Level23Single.cs", "Level33Script.cs"]

conversions = {
    "TUBE_TOP_LEFT": "PIPE_BODY_LEFT",
    "TUBE_TOP_RIGHT": "PIPE_BODY_RIGHT",
    "TUBE_SIDE_LEFT": "PIPE_TOP_LEFT",
    "TUBE_SIDE_RIGHT": "PIPE_TOP_RIGHT",
    "HILL_TOP": "HILLTOP"
}

all_levels = []
all_ratings = []
sliding_window = []

width_level = 382
height_level = 15
no_of_zeros = 29
window_size = 3
number_of_files = 20

for file_bbbb in range(len(all_files)):
    what_file = all_files[file_bbbb]
    if ".cs" in what_file:
        is_cs = True
        data = open("C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/Levels/" + what_file, 'r',
                    encoding='windows-1252')
        data_in_lines = data.readlines()
        dictionary_um = {}
    elif ".java" in what_file:
        is_cs = False
        data = open("C:/Users/teres/Internship/HIP Mario/MarioPCGStudy/MarioPCGStudy/LevelsFromStudy/" + what_file, 'r',
                    encoding='windows-1252')
        data_in_lines = data.readlines()
        dictionary_um = {}

    with open('blocks.txt', 'r') as blocks_txt:
        items_all = blocks_txt.readlines()

    with open('highest.txt', 'r') as highest_txt:
        highest_lines = highest_txt.readlines()
        latest_line = (highest_lines[-1:])
        latest_line = latest_line[0]
        highest_list = latest_line.replace("[", "").replace("]", "").replace("'", "").replace("\n", "").split(",")
        highest_list = [int(item) for item in highest_list]

    ranges = dict()
    with open('level_data.txt', 'w') as data_txt:
        for iteration, line in enumerate(data_in_lines):
            # SPRITES
            if ("etSprite") in line and not item_in_line(["x,", "y,", "i,", "[][]"], line):
                if is_cs:
                    multi_use()
                elif not is_cs:
                    item_br = (get_sprite_type_java(line))

            # BLOCKS
            if ("etBlock" in line) and not item_in_line(["x", "y", "i", "byte"], line):
                if is_cs:
                    multi_use()

                elif not is_cs:
                    item_br = (get_block_type_java(line))
                    if item_br in conversions:
                        item_br = conversions.get(item_br)
                    item_inventory(item_br, items_all)

                    data_txt.write(item_br + " ")
                    data_txt.write(str(get_block_coordinates_java(line)) + "\n")

                    usable_list = list(coordinate_extractor(line))
                    get_highest(usable_list[0], usable_list[1], highest_list)

                    dictionary_um[coordinate_extractor(line)] = item_br

            # FOR LOOPS
            if "for (int" in line and is_cs:
                # print(line)
                break_for_loop_into_range(line, ranges)

                next_line_num = iteration + 1
                next_line = data_in_lines[next_line_num]

            if "SetBlock" in line and is_cs:
                # print(line)
                item_br = get_block_sprite_type_cs(line)
                item_inventory(item_br, items_all)
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
                        dictionary_um[(x, y)] = item_br
                        get_highest(x, y, highest_list)
                        # for that weird if statement in line 155 of the script
                        if iteration == 157:
                            dictionary_um[(x, 6)] = "GROUNDBOTTOM"
                            get_highest(x, 6, highest_list)

    data_txt.close()

    level = [list([None for x in range(height_level)]) for y in range(width_level)]
    translations = block_label_to_tuple_dict()

    # print_map(level, translations, dictionary_um)

    for x in range(len(level)):
        for y in range(len(level[0])):
            if (x, y) in dictionary_um.keys():

                chars = len(dictionary_um[(x, y)])

                level[x][y] = translations[dictionary_um[(x, y)]]
            else:
                level[x][y] = [0] * no_of_zeros

    level = numpy.asarray(level)

    for i in range(0, level.shape[1] - window_size + 1):
        for j in range(0, level.shape[0] - window_size + 1):
            window = level[j:j + window_size, i:i + window_size]  # each individual window
            sliding_window.append(window)

    numpy.set_printoptions(threshold=numpy.inf)
    result = numpy.hstack(level)

    # all_levels.append(level)
    all_ratings.append(level_to_fun_value().get(what_file))

    # VERSION THAT DOES VERTICAL SLIDING WINDOWS
    # numpy.set_printoptions(threshold=numpy.inf)
    # for i in range(0, level.shape[0] - window_size + 1):
    #     window = level[i:i + window_size, :]  # each individual window
    #
    #     sliding_window.append(window)
    #     # raise (ValueError)
    #
    # numpy.set_printoptions(threshold=numpy.inf)
    # result = numpy.hstack(level)
    #
    # all_levels.append(level)
    # all_ratings.append(rube_goldberg().get(what_file))

# VERSION ThAT USES whole levels instead OF WINDOWS :P
# all_levels = numpy.asarray(all_levels)
# for i in range(len(all_ratings)):
#     all_ratings[i] = float(all_ratings[i])
# all_ratings = numpy.asarray(all_ratings)
# all_levels = all_levels.reshape(20, -1)
#
# X, y = all_levels, all_ratings
#
# sliding_window = numpy.asarray(all_levels)
#
# sliding_window.reshape(20, -1)

# all_levels = numpy.asarray(all_levels)

for i in range(len(all_ratings)):
    all_ratings[i] = float(all_ratings[i])

# because theres only 20 fun values and ALOT of sliding windows, we needa adjust the number of fun values to match
# the number of fun values wHILST retaining the fun value that matches up with the window :P

n = (width_level - window_size + 1)*(height_level - window_size + 1)
all_ratings = numpy.repeat(all_ratings, n)

# all_levels = all_levels.reshape(20, -1)

sliding_window = numpy.asarray(sliding_window)

sliding_window = sliding_window.reshape(n*number_of_files, -1)

X, y = sliding_window, all_ratings

# plt.figure()
clf = tree.DecisionTreeRegressor(max_depth=25)
clf = clf.fit(X, y)

dump(clf, 'pickle.joblib')

clf = load("pickle.joblib")

# tree.plot_tree(clf)


text_representation = tree.export_text(clf)

with open('dt_in_txt.txt', 'a+') as dt_in_txt:
    dt_in_txt.write(text_representation)


predicted_values = []

for i in range(0, height_level - window_size + 1):
    predicted_values.append([])
    for j in range(0, width_level - window_size + 1):
        window = level[j:j + window_size, i:i + window_size]  # each individual window
        window = numpy.asarray(window)
        window = window.reshape(1, -1)
        predicted_value = clf.predict(window)[0]
        predicted_values[i].append(predicted_value)

predicted_values = numpy.asarray(predicted_values)
print(predicted_values)

seaborn.heatmap(predicted_values)
plt.show()
