package tactifit.view;

import java.util.List;

import tactifit.models.Exercise;


public interface View {
    public void greetings();
    public void chooseTraining();
    public void tellTimeNow();
    public String readTraining();
    public int readTime();
    public int readReps();
    public List<Exercise> readExercises();
    public void goodbye(String time);
    public void customMessage(String message);
}