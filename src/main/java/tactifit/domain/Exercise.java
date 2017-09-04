package tactifit.domain;

public class Exercise {
	private String name;

	public String getName() {
		return name;
	}

	public Exercise(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
