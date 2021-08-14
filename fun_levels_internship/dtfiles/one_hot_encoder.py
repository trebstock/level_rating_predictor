# converts block labels to one hot encoded version
def block_label_to_tuple_dict():
    # 29 is just the amount of lines in blocks.txt
    empty_list = [0] * 31
    blocks_to_lists = {}

    with open('blocks.txt', 'r') as blocks_txt:
        items_all = blocks_txt.readlines()

    for block in range(len(items_all)):
        new_list = empty_list.copy()
        new_list[block] = 1
        new_list = new_list
        blocks_to_lists[items_all[block].replace('\n', '')] = new_list
    return blocks_to_lists
