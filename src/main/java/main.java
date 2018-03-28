import tactifit.controllers.TrainingController;

public class main {

	public static void main(String[] args) {
		
		TrainingController trainingController = new TrainingController();
		trainingController.setUp();
		trainingController.start();
		trainingController.finish();
	}

}
