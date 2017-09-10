package tactifit.implementation.flavours;

import java.io.Console;
import java.util.ArrayList;

import tactifit.api.Training;
import tactifit.domain.Exercise;
import tactifit.domain.Round;

public class SimpleSet implements Training {
	private ArrayList<Round> listOfExercies = new ArrayList<>();

	public SimpleSet(ArrayList<Round> listOfExercies) {
		this.listOfExercies = listOfExercies;
	}

	@Override
	public void startTrainingText() {
		System.out.println("We begin the custom simple set training!");
		for (Round round : listOfExercies) {
			Console console = System.console();
			System.out.println("Do " + round.getReps() + " reps of " + round.getExercise());
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
					System.out.println("Yes or no!");
				}
			} while (notDone);
		}
		System.out.println("Awesome! You are done! Go to the next!");
	}

	public static Training getInstanceText() {
		Console console = System.console();
		String exerciseNumber = console
				.readLine("How many exercises would you like to include in the custom simple set training?\t");
		String EMOMTimes = console.readLine("How many times do you want to perform the exercises?\t");
		String tempExercise;
		String tempIntReps;
		String tempIntRounds;
		ArrayList<Round> tempList = new ArrayList<>();
		for (int i = 0; i < Integer.parseInt(exerciseNumber); i++) {
			tempExercise = console.readLine("What exercise would like to perform as the " + (i + 1) + " exercise?\t");
			tempIntRounds = console.readLine("How many rounds?\t");
			tempIntReps = console.readLine("How many reps would you like to perform in each round?\t");
			for (int j = 0; j < Integer.parseInt(tempIntRounds); j++) {
				tempList.add(new Round(new Exercise(tempExercise), Integer.parseInt(tempIntReps)));
			}
		}
		return new SimpleSet(tempList);
	}

}
