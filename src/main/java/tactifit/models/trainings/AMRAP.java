package tactifit.models.trainings;

import java.io.Console;
import java.util.ArrayList;


import tactifit.models.Training;
import tactifit.models.Exercise;
import tactifit.models.Round;

public class AMRAP implements Training {
	private ArrayList<Round> listOfExercises = new ArrayList<>();
	private int trainingLength;

	// Probably not needed
	private long beginingOfTraining = System.nanoTime();

	private AMRAP(ArrayList<Round> listOfExercises, int trainingLength) {
		this.listOfExercises = listOfExercises;
		this.trainingLength = trainingLength;
	}

	public ArrayList<Round> getListOfExercises() {
		return listOfExercises;
	}

	public int getTrainingLength() {
		return trainingLength;
	}

	@Override
	public void startTraining() {
		System.out.println("We begin the AMRAP training!");
		System.out.println("For next " + trainingLength + " minutes keep doing the following exercises:");
		for(Round round : listOfExercises) {
			System.out.println(round);
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
		ArrayList<Round> tempList = new ArrayList<>();
		for (int i = 0; i < Integer.parseInt(exerciseNumber); i++) {
			tempExercise = console.readLine("What exercise would like to perform as the " + (i+1) + " exercise?\t");
			tempList.add(new Round(new Exercise(tempExercise), false, false));
		}
		return new AMRAP(tempList, Integer.parseInt(AMRAPTime));
	}

}
