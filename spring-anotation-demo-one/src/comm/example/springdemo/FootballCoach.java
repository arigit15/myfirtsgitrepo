package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sport.properties")

public class FootballCoach implements Coach {
	@Value("${foo.EmailAddress}")
	private String emailAddress;
	@Value("${foo.team}")
	private String team;
	
	
	
	private FortuneService myFortuneService;
	
	

	public FootballCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
   /* @Autowired
	public FootballCoach(FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	} */
    
    
    



	/*@Autowired
	public void myFortuneSet(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	} */


	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}






	public String getTeam() {
		return team;
	}






	/*public FortuneService getMyFortuneService() {
		return myFortuneService;
	} */






	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice forward for 2 hours daily!";
	}
	
	
	@Autowired
	
	public void setMyFortuneService(@Qualifier("fileFortuneService")FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	} 



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}
	
	@PostConstruct
	public void doSomeInitStuff()
	{
		System.out.println(">inside doSomeInitStuff()");
	}
	
	
	@PreDestroy
	public void doSomeCleanupStuff()
	{
		System.out.println(">inside doSomeCleanupStuff()");
	}

}
