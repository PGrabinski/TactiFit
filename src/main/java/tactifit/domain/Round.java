package tactifit.domain;

public class Round {
	private Exercise exercise;
	private int reps;

	public Exercise getExercise() {
		return exercise;
	}

	public int getReps() {
		return reps;
	}

	public Round(Exercise exercise, int reps) {
		this.exercise = exercise;
		this.reps = reps;
	}

	@Override
	public String toString() {
		return "Take a round of " + reps + " " + exercise +"s.";
	}
}
