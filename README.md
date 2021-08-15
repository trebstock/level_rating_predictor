# level_fun_value
## About this project
This project focuses on predicting the rating of Mario levels. These predictions are made by feeding a decision tree other Mario levels along with their rating. The Mario levels and their ratings are from the [Mario PCG dataset](http://guzdial.com/datasets/MarioPCGStudy.zip) and the [Gwario dataset](http://guzdial.com/datasets/GwarioData.zip).

The original papers for the datasets are:
- [Mario PCG Study](https://www.aaai.org/ocs/index.php/AIIDE/AIIDE16/paper/download/14008/13593)
- [Gwario Study](https://dl.acm.org/doi/pdf/10.1145/3102071.3102077)

## Project Organization
```
fun_levels_internship
├───datasets
│   ├───GwarioData
│       ├───GwarioData
│       │   ├───Levels
|       │   │   └───LogsFromGwario
|       │   └───__MACOSX
|       │       └───GwarioData
|       │           └───LogsFromGwario
|       └───MarioPCGStudy
|           └───MarioPCGStudy
|               ├───AnonymizedDirectory
|               ├───LevelsFromStudy
|              └───VisualizedLevels
└───dtfiles
    ├───blocks
    ├───combined_dict_heatmap
    ├───commented_gross
    ├───dt_in_txt
    ├───functions
    ├───highest
    ├───level_data
    ├───main
    ├───model.pmml
    ├───one_hot_encoder
    ├───parse_ratings
    ├───picklejoblib3
    ├───picklejoblib5
    ├───picklejoblib7
    └───picklejoblib9
```
       
## What We've Done So Far
We used [sci-kit learn's](https://scikit-learn.org/stable/) decsion tree regressor to create a decsion tree from sliced (sliced into 3by3s) maps and their corresponding ratings. We then used that decision tree to predict the ratings of other slices. Using this predictor, we created heatmaps of the levels with the variation in colour being based off the rating that slice got. The results from the heatmap were interesting as they highlighted the important parts of the map pretty well.
![Heatmap_overlay - B8](https://user-images.githubusercontent.com/88847148/129467060-1bfee112-4025-49b5-8d2e-3a091ffefc6c.png)
