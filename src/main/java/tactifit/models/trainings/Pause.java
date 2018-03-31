package tactifit.models.trainings;

import tactifit.models.Training;
import tactifit.view.View;
import tactifit.models.Timer;

public class Pause implements Training {
	private Timer timer;
	private View view;

	private Pause(String time, View view) {
		this.timer = new Timer(Integer.parseInt(time));
		this.view = view;
	}

	public void startTraining() {
		view.pauseWithTimer(this.timer);
	}


	public static Training getInstance(View view) {
		view.customMessage("Already planning a break?");
		String pauseTime = Integer.toString(view.readTime());// console.readLine("How long will be the pause (secs)?\t");
		return new Pause(pauseTime, view);
	}
}
