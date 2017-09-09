package tactifit.implementation.flavours;

import tactifit.api.Training;

public class SimpleSet implements Training {

	@Override
	public void startTrainingText() {
		// TODO Auto-generated method stub
		
	}
	
	public static Training getInstanceText() {
		return new SimpleSet();
	}

}
