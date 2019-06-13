package soccerleague;

public class League {
	private String title;
	private int year;
	private String Season;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public League(String title,int year,String season) {
		super();
		this.title=title;
		this.year=year;
		Season=season;
		// TODO Auto-generated constructor stub
	}
	

}
