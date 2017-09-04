import java.io.Console;

import tactifit.api.TrainingSession;
import tactifit.implementation.flavours.Standard21n15n9;

public class main {

	public static void main(String[] args) {
		TrainingSession trainingSession = new TrainingSession();
		Console console = System.console();
		String newTraining = console.readLine("Hello! What kind of a training would you like to add to the session?\t");
		switch (newTraining) {
		case "21-15-9":
			String exercise1 = console.readLine("What will be the first exercise?\t");
			String exercise2 = console.readLine("What will be the second exercise?\t");
			trainingSession.addTraining(new Standard21n15n9(exercise1, exercise2));

		}
		trainingSession.startSession();
	}

}
