package spring.demo.one;

public class CrciketCoach implements Coach {
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	
	

	public CrciketCoach() {
		super();
	}
	
	
	

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}




	public void setTeam(String team) {
		this.team = team;
	}




	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice fast bowling today!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
	}




	
}
