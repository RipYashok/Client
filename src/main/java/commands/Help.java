package commands;

public class Help extends Command {

    public Help() {
        setTitle("help");
        setDescription("help - выводит справку по доступным командам");
    }


    public void execute(){
        InsertNull insertNull = new InsertNull();
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
        System.out.println(insertNull.getDescription());
        System.out.println(save.getDescription());
        System.out.println(show.getDescription());
        System.out.println(exit.getDescription());
        System.out.println(clear.getDescription());
        System.out.println(removeKey.getDescription());
        System.out.println(executeScript.getDescription());
        System.out.println(maxByID.getDescription());
        System.out.println(averageOfStudentsCount.getDescription());
        System.out.println(removeAllByOfEducation.getDescription());
        System.out.println(replaceIfLowe.getDescription());
        System.out.println(history.getDescription());
        System.out.println(ANSI_YELLOW + removeLower.getDescription());
        System.out.println(ANSI_YELLOW + undate.getDescription());
        System.out.println(ANSI_YELLOW + info.getDescription());
        System.out.println(ANSI_YELLOW + help.getDescription());



    }
}

