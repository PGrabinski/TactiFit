package tactifit.models;

public class Round {
	private Exercise exercise;
	private int reps = -1;
	private int time = -1;
	private boolean onTime = false;
	private boolean onReps = false;

	public Exercise getExercise() {
		return exercise;
	}

	public int getReps() {
		return reps;
	}

	public Round(Exercise exercise, boolean onTime, boolean onReps) {
		this.exercise = exercise;
		this.onReps = onReps;
		this.onTime = onTime;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Take a round of " + reps + " " + exercise +"s.";
	}
}
