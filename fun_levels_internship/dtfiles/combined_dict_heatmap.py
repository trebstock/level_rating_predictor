from sklearn import tree
import numpy
import matplotlib.pyplot as plt
import seaborn
import pickle
from joblib import dump, load


all_levels = load('../all_levels_python')

width_level = 382
height_level = 15
no_of_zeros = 31
window_size = 3
padding_width = (window_size - 1) // 2
number_of_files = 20
blank_tile = [0] * no_of_zeros
blank_tile[-2] = 1
padding = [0] * no_of_zeros
padding[-1] = 1

fun_arrays = []
for window_size in [3,5]:
    clf = load("pickle.joblib" + str(window_size))
    for k in range(1,2):
        predicted_values = []
        level = all_levels[k]
        for i in range(0, height_level):
            predicted_values.append([])
            for j in range(0, width_level):
                window = level[j : j + window_size, i:i + window_size]  # each individual window
                window = numpy.asarray(window)
                window = window.reshape(1, -1)
                predicted_value = clf.predict(window)[0]
                predicted_values[i].append(predicted_value)

        predicted_values = numpy.asarray(predicted_values)
        fun_arrays.append(predicted_values)

heat_array = fun_arrays[0]
for i in range(1, len(fun_arrays)):
    heat_array = heat_array + fun_arrays[i]

seaborn.heatmap(heat_array)
plt.show()
