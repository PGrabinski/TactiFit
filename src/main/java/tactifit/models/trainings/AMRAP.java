package tactifit.models.trainings;

import java.io.Console;
import java.util.ArrayList;


import tactifit.models.Training;
import tactifit.models.Exercise;

public class AMRAP implements Training {
	private ArrayList<Exercise> listOfExercises = new ArrayList<>();
	private int trainingLength;
	private long beginingOfTraining = System.nanoTime();

	private AMRAP(ArrayList<Exercise> listOfExercises, int trainingLength) {
		this.listOfExercises = listOfExercises;
		this.trainingLength = trainingLength;
	}

	public ArrayList<Exercise> getListOfExercises() {
		return listOfExercises;
	}

	public int getTrainingLength() {
		return trainingLength;
	}

	@Override
	public void startTraining() {
		System.out.println("We begin the AMRAP training!");
		System.out.println("For next " + trainingLength + " minutes keep doing the following exercises:");
		for(Exercise exercise : listOfExercises) {
			System.out.println(exercise);
		}
		for(int i=0;i<trainingLength;i++) {
			try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println((i+1) + " minute(s) have passed.");
		}
	}

	public static Training getInstance() {
		Console console = System.console();
		String exerciseNumber = console
				.readLine("How many exercises would you like to include in the AMRAP training?\t");
		String AMRAPTime = console.readLine("How long do you want to perform the AMRAP training (in minutes)?\t");
		String tempExercise;
		ArrayList<Exercise> tempList = new ArrayList<>();
		for (int i = 0; i < Integer.parseInt(exerciseNumber); i++) {
			tempExercise = console.readLine("What exercise would like to perform as the " + (i+1) + " exercise?\t");
			tempList.add(new Exercise(tempExercise));
		}
		return new AMRAP(tempList, Integer.parseInt(AMRAPTime));
	}

}
