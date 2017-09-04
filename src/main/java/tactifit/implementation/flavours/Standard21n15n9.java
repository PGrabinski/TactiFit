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

	public void startTraining() {
		setUpTraining();
		Console console = System.console();
		System.out.println(
				"Starting a 21-15-9 training with " + exercise1.getName() + "s and " + exercise2.getName() + "s.");
		for (Round round : listOfExercies) {
			System.out.println(round);
			System.out.println("Have you finished the round?(Y/N)");
			String input = console.readLine();
			if ( input != "Y") {
				System.out.println("C'mon! You can do it!");
			}
		}
		System.out.println("Great! Now you can work out more!");
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

	public void setUpTraining() {
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

}
