package comm.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootballCoach myCoach=context.getBean("footballCoach", FootballCoach.class);
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());
		
		Coach myCoach1=context.getBean("DOGCoach",Coach.class);
		System.out.println(myCoach1.getDailyWorkOut());
		System.out.println(myCoach1.getDailyFortune());*/
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach myCoach=context.getBean("swimCoach",Coach.class);
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getDailyWorkOut());
		
		context.close();

	}

}
