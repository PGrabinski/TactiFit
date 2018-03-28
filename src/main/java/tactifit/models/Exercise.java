package tactifit.models;

// This is simple class for the exercise.
// So far, it cointains only name,
// but potentialy could be extended by description, image or even video tutorial.

public class Exercise {
	private String name;

	// Getter for the Name property
	public String getName() {
		return name;
	}

	// Constructor
	public Exercise(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
