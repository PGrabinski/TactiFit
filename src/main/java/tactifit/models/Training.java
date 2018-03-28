package tactifit.models;

public interface Training {
	public void startTrainingText();
	public static Training getInstanceText() {
		System.out.println("This training is not suppposed to be added to any training session.");
		return null;
	};
}
