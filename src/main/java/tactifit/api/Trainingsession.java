package tactifit.api;

import java.util.ArrayList;

public class Trainingsession {
	private ArrayList<Training> listOfTrainings;

	public void addTraining(Training trainging) {
		listOfTrainings.add(trainging);
	}

	public void startSession() {
		for(Training training : listOfTrainings) {
			training.startTraining();
		}
	}
}
