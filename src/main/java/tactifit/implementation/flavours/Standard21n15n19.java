package tactifit.implementation.flavours;

import java.util.ArrayList;

import tactifit.domain.Exercise;
import tactifit.domain.Round;
import tactifit.api.Training;

public class Standard21n15n19 implements Training {
	private ArrayList<Round> listOfExercies;
	private Exercise exercise1;
	private Exercise exercise2;

	public void startTraining() {
		System.out.println("Do 21 reps of both exercises, then again 15 of both and end with 9 of both.");
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
		int[] repsNumbers = {21,15,9};
		for(int n : repsNumbers) {
			
		}
	}
}
