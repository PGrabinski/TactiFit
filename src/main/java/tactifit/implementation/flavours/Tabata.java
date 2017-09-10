package tactifit.implementation.flavours;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Toolkit;

import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import tactifit.api.Training;
import tactifit.domain.Exercise;

public class Tabata implements Training {
	private Exercise exercise1;
	private Exercise exercise2;

	public Tabata(String exercise1, String exercise2) {
		this.exercise1 = new Exercise(exercise1);
		this.exercise2 = new Exercise(exercise2);
	}

	public Exercise getExercise1() {
		return exercise1;
	}

	public Exercise getExercise2() {
		return exercise2;
	}

	@Override
	public void startTrainingText() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		System.out.println(
				"We begin the tabata training composed of the following exercises: " + exercise1 + " and " + exercise2);
		for (int i = 0; i < 4; i++) {
			System.out.println("Perform " + exercise1 + "s for 20 seconds.");
			toolkit.beep();
			try {
				Thread.sleep(20 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Now we have a break for 10 seconds.");
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Perform " + exercise2 + "s for 20 seconds.");
			try {
				Thread.sleep(20 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Now we have a break for 10 seconds.");
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Well done! We have finished the tabata training!");
	}

	public static Training getInstanceText() {
		Console console = System.console();
		String exercise1 = console.readLine("What will be the first exercise?\t");
		String exercise2 = console.readLine("What will be the first exercise?\t");
		return new Tabata(exercise1, exercise2);
	}

}
