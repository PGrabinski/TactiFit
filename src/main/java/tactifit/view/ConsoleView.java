package tactifit.view;

import java.io.Console;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import tactifit.models.Exercise;
import tactifit.models.Timer;

// Console implementation of view interface
// For documentation see View.java

public class ConsoleView implements View{

    // Singleton structure
    private ConsoleView existingView = null;
    public View getViewGenerator() {
        if (existingView == null) {
            this.existingView = new ConsoleView();
        }
        return this.existingView;       
    }
    
    // Console instance for reading input form keyboard
    private Console console = System.console();
    
    public void greetings(){
        System.out.println("Welcome to today's trainning!");
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

    
    public int readTime() {
        String time = console.readLine("For how long (in seconds)?\t");
        return Integer.parseInt(time);
    };
    
    public int readReps() {
        String reps = console.readLine("How many reps?\t");
        return Integer.parseInt(reps);
    };
    
    public String readExerciseName() {
        String name = console.readLine("What exercise do you want to perform?\t");
        return name;
    }
    
    public void goodbye(String time){
        System.out.println("The training session took " + time + " seconds.");
        System.out.println("Thank you for the training! See you next time!");
        System.exit(0);
    };
    
    public void customMessage(String message) {
        System.out.println(message);
    }

    public void pauseWithTimer(Timer timer) {
		this.customMessage("You have a break for " + timer.getTime() + " seconds.");
		timer.startTimeOut();
		this.customMessage("The break is over! Get back to work!");        
    }
}