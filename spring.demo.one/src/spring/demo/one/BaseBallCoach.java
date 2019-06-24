package spring.demo.one;

public class BaseBallCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public BaseBallCoach() {
		super();
		System.out.println("BaseballCoach: Object Created");
	}
	public BaseBallCoach(FortuneService myFortuneService) {
		this.myFortuneService=myFortuneService;
		System.out.println("BaseballCoach: Dependency Injection Performed!");
	}
	
	
	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("setMyFortuneService: setter injection performed");
		this.myFortuneService = myFortuneService;
	}
	public String getDailyWorkOut()
	{
		return("Practice Backhead 30 timnes");
	}
	
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getemailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getteam() {
		// TODO Auto-generated method stub
		return null;
	}

}
