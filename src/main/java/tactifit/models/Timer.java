package tactifit.models;

import tactifit.view.View;

// Simple timer class.
// To be edited as now onlu fits the console version
public class Timer {
    private int beginingTime;
    private int givenTime;
    private int passedTime = 0;
    
    public Timer(int givenTime) {
        this.givenTime = givenTime;
    };

    public void startTimeOut() {
        try {
            Thread.sleep(givenTime*1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getTime() {
        return this.givenTime;
    }

}