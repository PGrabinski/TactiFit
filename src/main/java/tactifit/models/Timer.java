package tactifit.models;

public class Timer {
    private int beginingTime;
    private int givenTime;
    private int passedTime = 0;
    
    Timer(int givenTime) {
        this.givenTime = givenTime;
    };

}