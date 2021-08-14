# checks if theres a block in line
def item_in_line(forbidden_list, line):
    items_in_line = False
    for item in forbidden_list:
        if item in line:
            items_in_line = True
    return items_in_line


# finds the biggest coordinate throughout all of the levels (used to make a default level size)
def get_highest(x, y, highest):
    if x > highest[0]:
        highest[0] = x
        with open('highest.txt', 'a+') as highest_txt:
            highest_txt.write(str(highest) + "\n")
    if y > highest[1]:
        highest[1] = y
        with open('highest.txt', 'a+') as highest_txt:
            highest_txt.write(str(highest) + "\n")


# makes for loop in level code into a python range
def break_for_loop_into_range(line, ranges):
    good = line.split("(int ")[1]
    good = good.split(";")
    s0 = good[0].split()[-1]
    s1 = good[1].split()[-1]
    s2 = good[2].split(")")[0].strip()
    if s2 not in ["i++", "y++", "x++"]:
        raise ValueError
    ranges[s2[0]] = list(range(int(s0), int(s1)))


# extracts coordinate from line
def coordinate_extractor(line_q):
    for letter in line_q:
        if letter not in ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ","]:
            line_q = line_q.replace(letter, "")
    sep_coords = line_q.split(",")
    sep_coords.pop(2)
    sep_coords = [int(item) for item in sep_coords]
    sep_coords = tuple(sep_coords)
    return sep_coords


# gets the sprite type from a line in cs
def get_block_sprite_type_cs(line):
    return line[line.index("Map.") + len("Map."):line.rindex(");")]


# gets the coordinate from a line in cs
def get_coordinates_cs(line):
    coord = line[line.index("(") + len("("):line.rindex(", ")]
    coord = coord.split(",")
    coord[1] = coord[1].strip()
    for i in range(2):
        if coord[i].isnumeric():
            coord[i] = int(coord[i])
    return coord


# gets the block type from a line in java
def get_block_type_java(line):
    parsed = line.split("setBlock(")[1]
    parsed = parsed.split(", ")[2]
    if "Level." in line:
        parsed = parsed.split("Level.")[1]
    parsed = parsed.split(");")[0]
    return parsed


# gets the sprite type from a line in java
def get_sprite_type_java(line):
    parsed = line.split("setSpriteTemplate(")[1]
    parsed = parsed.split(".")[1]
    parsed = parsed.split(",")[0]
    return parsed


# gets coordinates from a line in java
def get_block_coordinates_java(line):
    coord = line[line.index("k(") + len("k("):line.rindex(", ")] + "\n"
    coord = coord.split(",")
    coord[1] = coord[1].strip()
    return coord


# an inventory of all the items throughout all the levels
def item_inventory(item_br, items_all):
    with open('blocks.txt', 'a+') as blocks_txt:
        if (item_br + "\n") not in items_all:
            items_all.append(item_br + "\n")
            blocks_txt.write(item_br + "\n")
    return items_all


# print the map with labels in text form
def print_map(level, translations, coord_to_block):
    for key in translations.keys():
        translations[key] = translations[key].index(1) + 1

    for x in range(len(level)):
        for y in range(len(level[0])):
            if (x, y) in coord_to_block.keys():
                chars = len(coord_to_block[(x, y)])
                level[x][y] = (15 - chars) * " " + coord_to_block[(x, y)]
            else:
                level[x][y] = 8 * " " + "nothing"
    for y in range(len(level[0])):
        for x in range(len(level)):
            print(level[x][y], end="")
        print()
    for x in range(len(level)):
        print(" " * (15 - len(str(x))) + str(x), end="")


# adds block found in line to inventory, writes block and coordinate to text file, adds coordinate to
# list that finds the highest coordinate, adds block and coordinate to dictionary -- MULTI-USE basically
def multi_use(current_item, line, items_all, data_txt, highest_list, coord_to_block):
    # adds item to blocks.txt if not already there
    item_inventory(current_item, items_all)

    # stores item and coord data in a txt file
    data_txt.write(current_item + " ")
    data_txt.write(str(coordinate_extractor(line)) + "\n")

    # add coordinates to highest coordinate list
    coordinate_in_list = list(coordinate_extractor(line))
    get_highest(coordinate_in_list[0], coordinate_in_list[1], highest_list)

    # add item and coordinate to main dictionary
    coord_to_block[coordinate_extractor(line)] = current_item
