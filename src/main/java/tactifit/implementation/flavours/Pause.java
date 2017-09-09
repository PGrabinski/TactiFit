package tactifit.implementation.flavours;

import java.io.Console;

import tactifit.api.Training;

public class Pause implements Training {
	private int time;

	public Pause(String time) {
		this.time = Integer.parseInt(time);
	}

	public int getTime() {
		return time;
	}

	@Override
	public void startTrainingText() {
		System.out.println("You have a break for " + time + " seconds.");
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The break is over! Get back to work!");
	}


	public static Training getInstanceText() {
		Console console = System.console();
		String pauseTime = console.readLine("How long will be the pause (secs)?\t");
		return new Pause(pauseTime);
	}
}
