/*package spring.demo.one;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		
		//Step-1 --get the applicationContext
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean
		Coach myCoach=context.getBean("myBaseBallCoach",Coach.class);
		
		//call the appropriate method(s)
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getDailyFortune());
		
		
		
		//close the context
		context.close();
	}

}*/
