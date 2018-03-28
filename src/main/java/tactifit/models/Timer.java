package tactifit.models;

import tactifit.view.View;

public class Timer {
    private int beginingTime;
    private int givenTime;
    private int passedTime = 0;
    private View view;
    
    Timer(int givenTime, View view) {
        this.givenTime = givenTime;
        this.view = view;
    };

    public void startTimeOut() {
        try {
            Thread.sleep(givenTime*1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}