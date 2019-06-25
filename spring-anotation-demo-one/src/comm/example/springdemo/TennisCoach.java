package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component("theCoach")

public class TennisCoach implements Coach {

	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice backhand 30 times daily!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
