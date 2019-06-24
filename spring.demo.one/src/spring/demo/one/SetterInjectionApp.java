package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("setter-applicationContext.xml");
		
		TennisCoach myCoach=context.getBean("myCoach",TennisCoach.class);
		
		boolean result=(myCoach==myCoach);
		
		//if scope is singleton then,both object return same location
		//if scope is prototype then,both having different location
		
		
		System.out.println("Email address==>"+myCoach.getEmailAddress());
		System.out.println("Team==>"+myCoach.getTeam());
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getDailyFortune());
	}

}
