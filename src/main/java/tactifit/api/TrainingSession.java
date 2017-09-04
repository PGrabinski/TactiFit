package tactifit.api;

import java.util.LinkedList;

public class TrainingSession {
	private LinkedList<Training> listOfTrainings = new LinkedList<>();

	public void addTraining(Training training) {
		listOfTrainings.add(training);
	}

	public void startSession() {
		for (Training training : listOfTrainings) {
			training.startTraining();
		}
	}
}
