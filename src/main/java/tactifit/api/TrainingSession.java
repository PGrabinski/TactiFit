package tactifit.api;

import java.io.Console;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.core.ConstantException;

import tactifit.implementation.flavours.AMRAP;
import tactifit.implementation.flavours.DeathBySth;
import tactifit.implementation.flavours.EMOM;
import tactifit.implementation.flavours.Pause;
import tactifit.implementation.flavours.SimpleSet;
import tactifit.implementation.flavours.Standard21n15n9;
import tactifit.implementation.flavours.Tabata;

public class TrainingSession {
	private LinkedList<Training> listOfTrainings = new LinkedList<>();
	private long beginingTime = System.nanoTime();
	private Date beginingDate = new Date();

	public void addTraining(Training training) {
		listOfTrainings.add(training);
	}

	public void startSessionText() {
		System.out.println("We begine our new trainning session at: " + beginingDate);
		for (Training training : listOfTrainings) {
			training.startTrainingText();
			System.out.println("It is: " + LocalDateTime.now());
		}
		System.out.println("Awesome! You have finished the workout! Now do some streatching, take a shower and hit a bar! You have earned it!");
	}
	
	public void endSessionText() {
		System.out.println("The training session took " + String.valueOf((System.nanoTime()-beginingTime)/1000000000.0));
	}

	public void setUpSession(TrainingSession trainingSession) {
		Console console = System.console();
		System.out.println("Welcome to the new training session!");
		boolean addedSth = true;
		while (addedSth) {
			System.out.println("What kind of a training would you like to add to the session?");
			System.out.println("1 -> 21-15-9");
			System.out.println("2 -> EMOM");
			System.out.println("3 -> AMRAP");
			System.out.println("4 -> Death by ...");
			System.out.println("5 -> Tabata");
			System.out.println("6 -> Simple set");
			System.out.println("7 -> Pause");
			System.out.println("0 -> Nothing more");
			String newTraining = console.readLine("Choose index of the training.\t");
			switch (newTraining) {
			case "0":
				addedSth = false;
				break;
			case "1":
				addTraining(Standard21n15n9.getInstanceText());
				break;
			case "2":
				addTraining(EMOM.getInstanceText());
				break;
			case "3":
				addTraining(AMRAP.getInstanceText());
				break;
			case "4":
				addTraining(DeathBySth.getInstanceText());
				break;
			case "5":
				addTraining(Tabata.getInstanceText());
				break;
			case "6":
				addTraining(SimpleSet.getInstanceText());
				break;
			case "7":
				addTraining(Pause.getInstanceText());
				break;
			}

		}
	}
}
