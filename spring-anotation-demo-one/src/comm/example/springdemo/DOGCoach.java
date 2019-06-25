package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component

public class DOGCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Train your dog for 2-3 hours daily!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "The dog is lucky for you today!";
	}

}
