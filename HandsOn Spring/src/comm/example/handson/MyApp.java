package comm.example.handson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Coach myCoach=context.getBean("footballCoach",Coach.class);
		System.out.println(myCoach.getDailyFortune());
		context.close();

	}

}
