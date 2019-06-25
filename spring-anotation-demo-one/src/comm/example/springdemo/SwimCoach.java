package comm.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {

	public SwimCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "dont' swim today!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

}
