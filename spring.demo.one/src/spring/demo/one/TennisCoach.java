package spring.demo.one;

public class TennisCoach implements Coach {

	private String emailAddress;
	private String team;

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run 5000 mts daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day";
	}


	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return emailAddress;
	}

	
	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}

	

	
}
