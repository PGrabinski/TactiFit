package tactifit.implementation.flavours;

import java.io.Console;
import java.util.ArrayList;

import tactifit.api.Training;
import tactifit.domain.Exercise;

public class EMOM implements Training {

	private ArrayList<Exercise> listOfExercies = new ArrayList<>();
	private int times;

	public EMOM(ArrayList<Exercise> listOfExercies, int times) {
		this.listOfExercies = listOfExercies;
		this.times = times;
	}

	@Override
	public void startTrainingText() {
		System.out.println("We begin the EMOM training!");
		for (int i = 0; i < times; i++) {
			for (Exercise exercise : listOfExercies) {
				System.out.println("Let's do some " + exercise + "!");
				try {
					Thread.sleep(60 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
System.out.println("We are done with it! Keep going!");
	}

	public static Training getInstanceText() {
		Console console = System.console();
		String exerciseNumber = console
				.readLine("How many exercises would you like to include in the EMOM training?\t");
		String EMOMTimes = console.readLine("How many times do you want to perform the exercises?\t");
		String tempExercise;
		ArrayList<Exercise> tempList = new ArrayList<>();
		for (int i = 0; i < Integer.parseInt(exerciseNumber); i++) {
			tempExercise = console.readLine("What exercise would like to perform as the " + (i + 1) + " exercise?\t");
			tempList.add(new Exercise(tempExercise));
		}
		return new EMOM(tempList, Integer.parseInt(EMOMTimes));
	}

}
