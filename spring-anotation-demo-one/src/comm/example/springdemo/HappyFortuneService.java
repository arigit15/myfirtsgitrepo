package comm.example.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day!";
	}

}
