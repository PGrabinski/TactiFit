package tactifit.implementation.flavours;

import java.io.Console;

import tactifit.api.Training;
import tactifit.domain.Exercise;

public class DeathBySth implements Training {
	private Exercise exercise;

	public DeathBySth(String exercise) {
		this.exercise = new Exercise(exercise);
	}

	@Override
	public void startTrainingText() {
		System.out.println("We begin the Death by " + exercise + " training!");
		int i = 1;
		while (true) {
			System.out.println("Perform " + i + exercise);
		}
	}

	public DeathBySth(Exercise exercise) {
		this.exercise = exercise;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public static Training getInstanceText() {
		Console console = System.console();
		String exercise = console.readLine("What exercise would you like to die with?\t");
		return new DeathBySth(new Exercise(exercise));
	}

}
