# level_rating_predictor
## About this project
This project focuses on predicting the enjoyment rating of Mario levels. These predictions are made by feeding a decision tree Mario levels along with their enjoyment ratings. The Mario levels and their ratings are from the [Mario PCG dataset](http://guzdial.com/datasets/MarioPCGStudy.zip) and the [Gwario dataset](http://guzdial.com/datasets/GwarioData.zip).

The original papers for the datasets are:
- [Mario PCG Study](https://www.aaai.org/ocs/index.php/AIIDE/AIIDE16/paper/download/14008/13593)
- [Gwario Study](https://dl.acm.org/doi/pdf/10.1145/3102071.3102077)

## Project Organization
```
fun_levels_internship
├───README                                     <- README to explain the project files ;)
├───pcg-solution                               <- Mario engine being used with genetic algorithms to produce optimized levels 
└───fun_levels_internship                         (I am in the process of changing Jumper to be optimized for high fun values)
    ├───datasets                               <- data used for the project                      \
    │       ├───GwarioData                     <- data for Gwario levels       
    |       |   └───GwarioData                 
    │       │       ├───Levels
    |       │       ├───LogsFromGwario
    |       |       └───gwario results
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
       
## What I've Done So Far
I used [sci-kit learn's](https://scikit-learn.org/stable/) decsion tree regressor to create a decsion tree from sliced (sliding windows) maps and their corresponding ratings. I then used the newly created decision tree to predict the ratings of the individual slices. Using this predictor, I created heatmaps of the level. The variation in colour conveys the predicted rating the slice got. The results from the heatmap were interesting as they highlighted the important parts of the map pretty well.

![Heatmap_overlay - B8](https://user-images.githubusercontent.com/88847148/129467060-1bfee112-4025-49b5-8d2e-3a091ffefc6c.png)
*Heatmap overlayed ontop of TestLevelB8*

## Issues to be aware of
- The time it takes to run the program is extremely long so I'd recommend pickling the data. I've already written the code to dump and load the data, but it's currently commented out. 
- I didn't change the absolute file directories to relative file directories; code won't run on other computers.
- There seems to be an issue with parsing the for loops in some of the levels. 

## Next Steps & Research Ideas
- Increased range of rating types — use rating types other than just "Fun" in the decision tree. 
- "Highest rated" level — using the code from the pcg-solution folder, make the "highest rated" level using the decision tree predictor and a Genetic Algorithm optimized for levels with high fun values.
- Recognizing structures —  train the model to recongize structures (e.g. staircases. As of now, the "highest rated" level would just be a mess of "high rated" slices.

## Contact me
If you have any questions about this project feel free to send a message to my discord, treesuh#4095, or my email, t.rebstock@share.epsb.ca! 
