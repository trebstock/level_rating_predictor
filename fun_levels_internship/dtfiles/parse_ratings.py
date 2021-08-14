from os import listdir
from os.path import isfile, join
import csv
import statistics

all_files = ["MarioLevel.java", "TestLevelB1.java", "TestLevelB8.java", "TestLevelB9.java", "TestLevelB11.java",
             "TestLevelB13.java", "TestLevelC0.java", "TestLevelC5.java", "TestLevelC13.java", "TestLevelC14.java",
             "TestLevelC16.java", "TestLevelD1.java", "TestLevelD2.java", "TestLevelD6.java", "TestLevelD8.java",
             "TestLevelD10.java", "Level11Single.cs", "Level22Single.cs", "Level23Single.cs", "Level33Script.cs"]


def level_to_fun_value():
    # fun rating parser for gwario levels
    def gwario_cs():
        # matches up id with the levels that id played
        def id_to_l_value_maker(ID, level):
            temp_list = []
            if ID in ID_to_levels.keys():
                temp_list = ID_to_levels.get(ID)
            temp_list = list(temp_list)
            temp_list.append(level)
            return temp_list

        # gets all the names of the files (this tells us which IDs played which games)
        files = [file for file in listdir('C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/LogsFromGwario') if
                 isfile(join('C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/LogsFromGwario', file))]

        # make a copy because I want to filter out some of the files but dont want to change the original version
        files_temp = files.copy()
        for item in range(len(files)):
            if "--" not in files[item]:
                files_temp.remove(files[item])
                continue
            file_inspection = open('C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/LogsFromGwario/' + files[item], 'r',
                                   encoding='windows-1252')
            win_condition_met = False
            timed = False
            for line in file_inspection:
                if "Win!" in line or "Lost!" in line:
                    win_condition_met = True
                if "Player Totaltime" in line:
                    timed = True
            if not win_condition_met or not timed or "3+9999" in files[item]:
                files_temp.remove(files[item])

        ID_to_levels = {}
        levels_to_rankings = {}
        unparsed_to_time = {}

        # parse the names of the files
        for item in range(len(files_temp)):
            parsed_file_name = files_temp[item].split('+')[1]
            parsed_file_name = parsed_file_name.split(".txt")[0]
            parsed_file_name = parsed_file_name.split("--")
            player_ID = parsed_file_name[0]
            level_played = parsed_file_name[1]
            # open up the file to check in which order the ID played the games
            check_for_order = open(
                'C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/LogsFromGwario/' + files_temp[item],
                'r', encoding='windows-1252')
            check_for_order_lines = check_for_order.readlines()

            # route ID to the levels that were played by that ID using dictionary
            ID_to_levels[player_ID] = tuple(id_to_l_value_maker(player_ID, level_played))

            # check for the player starting time
            starting_time = None
            for line in check_for_order_lines:
                if "Player Totaltime" in line:
                    starting_time = line.split("StTime = ")[1]
                    starting_time = starting_time.split(" EdTime")[0]
                    break

            # add to dictionary which gives unparsed file name to starting time
            if player_ID in unparsed_to_time.keys():
                unparsed_to_time[player_ID].append([float(starting_time), level_played])
            else:
                unparsed_to_time[player_ID] = [[float(starting_time), level_played]]

        # orders levels based on starting time
        for item in ID_to_levels.keys():
            if (unparsed_to_time.get(item))[0][0] > (unparsed_to_time.get(item))[1][0]:
                ID_to_levels[item] = (ID_to_levels.get(item)[1], ID_to_levels.get(item)[0])

        # parse the rankings from the csv file
        with open('C:/Users/teres/Internship/HIP Mario/GwarioData/GwarioData/gwario results.csv', 'r') as file:
            reader = csv.reader(file)

            rankings_for_each_level = {}

            for row in reader:
                # skips header
                if "SingleplayerFunEngagementChoice" in row:
                    continue
                ID = row[0]
                ranking = int(row[25])
                # skips some of the IDs because they didn't define starting time
                if ID not in ID_to_levels:
                    continue

                # if ranking in the first space is already there, add ranking, if not, make the
                # first space equal to ranking
                if ID_to_levels[ID][ranking - 1] in rankings_for_each_level:
                    rankings_for_each_level[ID_to_levels[ID][ranking - 1]].append(ranking)
                else:
                    rankings_for_each_level[ID_to_levels[ID][ranking - 1]] = [ranking]

        # dictionary with level and the median fun value that goes along with it
        level_medians = {}

        # gives a median for each level
        for level in rankings_for_each_level:
             level_medians[level] = statistics.median(rankings_for_each_level[level]) - 1.0

        return level_medians

    # fun rating parser for pcg files
    def pcg_java():
        dict_of_files = {}

        # open csv and get level and corresponding fun value
        with open('C:/Users/teres/Internship/HIP Mario/MarioPCGStudy/MarioPCGStudy/AnonymizedDirectory/pcg results.csv', 'r') as file:
            reader = csv.reader(file, delimiter='\t')
            for row in reader:
                parsed_row = row[0].split(",")
                parsed_row = parsed_row[4:7]
                if str(parsed_row) == "['Fun1', 'Fun2', 'Fun3']":
                    continue
                for ranking in range(len(parsed_row)):
                    temp_list = []
                    # if in dictionary, add on, if not, add to dictionary
                    if parsed_row[ranking] in dict_of_files:
                        temp_list = dict_of_files.get(parsed_row[ranking])
                    temp_list = list(temp_list)
                    temp_list.append(ranking + 1)
                    dict_of_files[parsed_row[ranking]] = tuple(temp_list)

        all_important_files = list(dict_of_files.keys())

        # get a median for all the files
        for level in range(len(all_important_files)):
            dict_of_files[all_important_files[level]] = (statistics.median(dict_of_files.get(all_important_files[level])) - 1.0) / 2.0

        return dict_of_files

    dict1 = gwario_cs()
    dict2 = pcg_java()

    # combine the two dictionaries
    (dict1.update(dict2))

    dict2 = {}
    # edit the names slightly so the names match up
    for key in dict1:
        for item in all_files:
            if key.replace("-", "") in item:
                dict2[item] = dict1[key]

    # return all the level to fun value dictionary
    return dict2
