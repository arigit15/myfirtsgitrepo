package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component

public class FileFortuneService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Welcome to filefortune!";
	}

}
