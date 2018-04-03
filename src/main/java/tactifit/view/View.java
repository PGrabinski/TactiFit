package tactifit.view;

import java.util.List;

import tactifit.models.Exercise;
import tactifit.models.Timer;

// Interface decoupling the view part according to the MVC model.
// Should be implemented by a singleton class.
public interface View {
    
    /** Implies the singleton structure of the class
     * @return a signleton instance of the class
     */
    public View getViewGenerator();
    
    /** Generates welcome view
     */
    public void greetings();
    
    /** Returns current time - is it needed?
     */
    public void tellTimeNow();
    
    // Asks about next training to be added
    public String readTraining();

    // Reads time of the given round
    public int readTime();

    // Reads number of reps of the given round
    public int readReps();

    // Reads name of the exercise in the given round
    public String readExerciseName();

    // Generates view for the end of the training
    public void goodbye(String time);

    // Generates view for a custom message
    public void customMessage(String message);
    
    // Generates pause response
    public void pauseWithTimer(Timer timer);

    // Not sure if needed
    // public List<Exercise> readExercises();
    // public void chooseTraining();
}