package tactifit.implementation.flavours;

import java.io.Console;
import java.util.ArrayList;

import tactifit.domain.Exercise;
import tactifit.domain.Round;
import tactifit.api.Training;

public class Standard21n15n9 implements Training {
	private ArrayList<Round> listOfExercies = new ArrayList<>();
	private Exercise exercise1;
	private Exercise exercise2;

	public void startTrainingText() {
		setUpTraining();
		Console console = System.console();
		System.out.println(
				"Starting a 21-15-9 training with " + exercise1.getName() + "s and " + exercise2.getName() + "s.");
		for (Round round : listOfExercies) {
			System.out.println(round);
			String input = console.readLine("Have you finished the round?(Y/N)\t");
			boolean notDone = true;
			do {
				if (input == "N") {
					System.out.println("C'mon! You can do it!");
				}
				if (input == "Y") {
					System.out.println("Great! Keep going!");
					break;
				} else {
					System.out.println("Yes or not!");
				}
			} while (notDone);
		}
		System.out.println("Great! We have finished the 21-15-9 training!");
	}

	public Exercise getExercise1() {
		return exercise1;
	}

	public void setExercise1(Exercise exercise1) {
		this.exercise1 = exercise1;
	}

	public Exercise getExercise2() {
		return exercise2;
	}

	public void setExercise2(Exercise exercise2) {
		this.exercise2 = exercise2;
	}

	private void setUpTraining() {
		int[] repsNumbers = { 21, 15, 9 };
		for (int n : repsNumbers) {
			listOfExercies.add(new Round(exercise1, n));
			listOfExercies.add(new Round(exercise2, n));
		}
	}

	public Standard21n15n9(String exercise1, String exercise2) {
		this.exercise1 = new Exercise(exercise1);
		this.exercise2 = new Exercise(exercise2);
	}

	public static Training getInstanceText() {
		Console console = System.console();
		String exercise1 = console.readLine("What will be the first exercise?\t");
		String exercise2 = console.readLine("What will be the second exercise?\t");
		return new Standard21n15n9(exercise1, exercise2);
	}
}
