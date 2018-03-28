package tactifit.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;

import tactifit.models.Training;
import tactifit.models.trainings.AMRAP;
import tactifit.models.trainings.Pause;
import tactifit.view.ConsoleView;
import tactifit.view.View;
// import tactifit.models.trainings.DeathBySth;
// import tactifit.models.trainings.EMOM;
// import tactifit.models.trainings.SimpleSet;
// import tactifit.models.trainings.Standard21n15n9;
// import tactifit.models.trainings.Tabata;

public class TrainingController {
	private LinkedList<Training> listOfTrainings = new LinkedList<>();
	private long beginingTime = System.nanoTime();
	private Date beginingDate = new Date();
	private View view = new ConsoleView();

	public void addTraining(Training training) {
		listOfTrainings.add(training);
	}

	public void start() {
		view.customMessage("We begine our new trainning session at: " + beginingDate);
		for (Training training : listOfTrainings) {
			training.startTrainingText();
			view.tellTimeNow();
		}
		view.customMessage("Awesome! You have finished the workout! Now do some streatching, take a shower and hit a bar! You have earned it!");
	}
	
	public void finish() {
		view.goodbye(String.valueOf((System.nanoTime()-beginingTime)/1000000000.0));
	}

	public void setUp() {
		this.view.greetings();
		boolean addedSth = true;
		while (addedSth) {
			String newTraining = this.view.readTraining();
			switch (newTraining) {
				case "0":
					addedSth = false;
					break;
				// case "1":
				// 	addTraining(Standard21n15n9.getInstanceText());
				// 	break;
				// case "2":
				// 	addTraining(EMOM.getInstanceText());
				// 	break;
				case "3":
					addTraining(AMRAP.getInstanceText());
					break;
				// case "4":
				// 	addTraining(DeathBySth.getInstanceText());
				// 	break;
				// case "5":
				// 	addTraining(Tabata.getInstanceText());
				// 	break;
				// case "6":
				// 	addTraining(SimpleSet.getInstanceText());
				// 	break;
				case "7":
					addTraining(Pause.getInstance(this.view));
					break;
			}

		}
	}
}
