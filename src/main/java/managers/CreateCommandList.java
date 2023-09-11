package managers;

import commands.*;

import java.util.HashMap;
import java.util.Map;

public class CreateCommandList {
    Map<String, Command> Commands = new HashMap<String, Command>();
    InsertNull insertNull = new InsertNull();
    Commands.
    Save save = new Save();
    Show show = new Show();
    Exit exit = new Exit();
    Clear clear = new Clear();
    RemoveKey removeKey = new RemoveKey();
    ExecuteScript executeScript = new ExecuteScript();
    MaxByID maxByID = new MaxByID();
    AverageOfStudentsCount averageOfStudentsCount = new AverageOfStudentsCount();
    RemoveAllByOfEducation removeAllByOfEducation = new RemoveAllByOfEducation();
    ReplaceIfLowe replaceIfLowe = new ReplaceIfLowe();
    History history = new History();
    RemoveLower removeLower = new RemoveLower();
    Undate undate = new Undate();
    Info info = new Info();
    Help help = new Help();
}
