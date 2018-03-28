package tactifit.view;

import java.io.Console;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import tactifit.models.Exercise;

public class ConsoleView implements View{

    private Console console = System.console();

    public void greetings(){
        System.out.println("Hello this is your new training!");
    };

    public String readTraining() {
        System.out.println("What kind of a training would you like to add to the session?");
		System.out.println("1 -> 21-15-9");
		System.out.println("2 -> EMOM");
		System.out.println("3 -> AMRAP");
		System.out.println("4 -> Death by ...");
		System.out.println("5 -> Tabata");
		System.out.println("6 -> Simple set");
		System.out.println("7 -> Pause");
		System.out.println("0 -> Nothing more");
        String newTraining = console.readLine("Choose index of the training.\t");
        return newTraining;
    }
    
    public void tellTimeNow() {
        System.out.println("It is: " + LocalDateTime.now());
    }
    public void chooseTraining(){};
    public int readTime(){ return 0;};
    public int readReps(){ return 0;};
    public List<Exercise> readExercises(){ return new ArrayList();};
    public void goodbye(String time){
        System.out.println("The training session took " + time);
    };

    public void customMessage(String message) {
        System.out.println(message);
    }

}