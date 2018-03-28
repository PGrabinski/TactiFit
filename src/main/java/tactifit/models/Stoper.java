package tactifit.models;

import java.time.LocalDateTime;


// Class implementing simple stopper with pause option

public class Stoper {
    private int beginingTime = -1;
    private int passedTime = 0;

    public void start() {
        if(this.beginingTime != -1) {
            this.beginingTime = LocalDateTime.now().getSecond();
        }
    }

    public void pause() {
        if(this.beginingTime != -1) {
            this.passedTime += LocalDateTime.now().getSecond() - this.beginingTime;
            this.beginingTime = -1;
        }
    }

    public int getTimepassed() {
        if(this.beginingTime != -1) {
            return this.passedTime;
        } else {
            return this.passedTime + LocalDateTime.now().getSecond() - this.beginingTime;
        }
    }
}