import java.io.Console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tactifit.api.TrainingSession;
import tactifit.implementation.flavours.Pause;
import tactifit.implementation.flavours.Standard21n15n9;

public class main {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		TrainingSession trainingSession = context.getBean("trainingSession", TrainingSession.class);*/
		TrainingSession trainingSession = new TrainingSession();
		trainingSession.setUpSession(trainingSession);
		trainingSession.startSessionText();
		trainingSession.endSessionText();
	}

}
