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
		if (this.onReps){
			this.reps = reps;
		}
	}

	public void setTime(int time) {
		if (this.onTime) {
			this.time = time;
		}
	}

	/**
	 * @return the onReps
	 */
	public boolean isOnReps() {
		return onReps;
	}

	/**
	 * @return the onTime
	 */
	public boolean isOnTime() {
		return onTime;
	}
	
	@Override
	public String toString() {
		if (this.onReps) {
			return "Take a round of " + this.reps + " " + this.exercise + "s.";
		}
		if (this.onTime) {
			return "Roudn of " + this.exercise + " will take " + this.time + " seconds";
		}
		return "";
	}
}
