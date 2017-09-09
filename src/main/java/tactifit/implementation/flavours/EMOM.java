package tactifit.implementation.flavours;

import tactifit.api.Training;

public class EMOM implements Training {

	@Override
	public void startTrainingText() {
		// TODO Auto-generated method stub

	}

	public static Training getInstanceText() {
		return new EMOM();
	}

}
