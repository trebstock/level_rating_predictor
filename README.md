# level_rating_predictor
## About this project
This project focuses on predicting the rating of Mario levels. These predictions are made by feeding a decision tree other Mario levels along with their rating. The Mario levels and their ratings are from the [Mario PCG dataset](http://guzdial.com/datasets/MarioPCGStudy.zip) and the [Gwario dataset](http://guzdial.com/datasets/GwarioData.zip).

The original papers for the datasets are:
- [Mario PCG Study](https://www.aaai.org/ocs/index.php/AIIDE/AIIDE16/paper/download/14008/13593)
- [Gwario Study](https://dl.acm.org/doi/pdf/10.1145/3102071.3102077)

## Project Organization
```
fun_levels_internship
├───README                                     <- README to explain the project files ;)
└───fun_levels_internship                      
    ├───datasets                               <- data used for the project
    │   ├───GwarioData                         <- data for Gwario levels
    │       ├───GwarioData                      
    │       │   ├───Levels
    |       │   │   └───LogsFromGwario
    |       │   └───__MACOSX
    |       │       └───GwarioData
    |       │           └───LogsFromGwario
    |       └───MarioPCGStudy                  <- data for Mario PCG levels
    |           └───MarioPCGStudy
    |               ├───AnonymizedDirectory
    |               ├───LevelsFromStudy
    |               └───VisualizedLevels
    └───dtfiles
        ├───blocks                             <- txt with the blocks used across all the levels
        ├───highest                            <- txt that determines the highest coordinate out of all the levels
        ├───level_data                         <- txt with the blocks and cooresponding coordinates for each level
        ├───combined_dict_heatmap              <- creates heatmap that uses a combination of the decision trees for different slice sizes                
        ├───dt_in_txt                          <- creates decision tree in text form
        ├───functions                          <- the functions used throughout the project
        ├───main                               <- main python file — parses the datasets, creates the decision tree, makes heatmap with predicted values
        ├───one_hot_encoder                    <- makes blocks one hot encoded
        ├───parse_ratings                      <- parses ratings
        ├───picklejoblib3                      <- pickled decision trees 
        ├───picklejoblib5                         (the numbers represent which slice is used. e.g. "picklejobli3" uses 3by3 slices)
        ├───picklejoblib7
        ├───picklejoblib9
        ├───pipeline                           <- pipeline that makes decision tree accessible to Genetic Algorithm files
        └───model.pmml                         <- apart of pipeline 
```
       
## What We've Done So Far
We used [sci-kit learn's](https://scikit-learn.org/stable/) decsion tree regressor to create a decsion tree from sliced (sliced into 3by3s) maps and their corresponding ratings. We then used that decision tree to predict the ratings of other slices. Using this predictor, we created heatmaps of the levels with the variation in colour being based off the rating that slice got. The results from the heatmap were interesting as they highlighted the important parts of the map pretty well.

![Heatmap_overlay - B8](https://user-images.githubusercontent.com/88847148/129467060-1bfee112-4025-49b5-8d2e-3a091ffefc6c.png)
*Heatmap overlayed ontop of TestLevelB8*

Some work has been done to integrate the rating predictor with the Genetic Algorithm Mario engine, but no results have been produced. More of a future goal.

## Next Steps & Research Ideas
"Best" level created using decision tree predictor and the Genetic Algorithm — 
Increased range of rating types —
Recognizing structures —

## Contact me
If you have any questions about this project feel free to send a message to my discord, treesuh#4095, or my email, t.rebstock@share.epsb.ca! 
