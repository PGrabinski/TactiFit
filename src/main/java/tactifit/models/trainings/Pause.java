package tactifit.models.trainings;

import java.io.Console;

import tactifit.models.Training;
import tactifit.view.View;
import tactifit.models.Timer;

public class Pause implements Training {
	private int time;
	private Timer timer;
	private View view;

	private Pause(String time, View view) {
		this.time = Integer.parseInt(time);
		this.timer = new Timer(Integer.parseInt(time));
		this.view = view;
	}

	public void startTrainingText() {
		view.customMessage("You have a break for " + time + " seconds.");
		this.timer.startTimeOut();
		view.customMessage("The break is over! Get back to work!");
	}


	public static Training getInstance(View view) {
		view.customMessage("Already planning a break?");
		String pauseTime = Integer.toString(view.readTime());// console.readLine("How long will be the pause (secs)?\t");
		return new Pause(pauseTime, view);
	}
}
