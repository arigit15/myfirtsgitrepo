package soccerleague;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LeagueListener implements ServletContextListener{
	String str=null;
@Override
public void contextInitialized(ServletContextEvent sce) {
	ServletContext context=sce.getServletContext();
	
	List<League> l=new ArrayList<League>();
	str=(String)context.getInitParameter("Leagues-file");
	System.out.println(str);
	String[] arr=str.split(",");
	League newLeague=new League(arr[0],Integer.parseInt(arr[1]),arr[2]);
	l.add(newLeague);
	context.setAttribute("leaguelist", l);
	
}

@Override
public void contextDestroyed(ServletContextEvent sce) {
	str=null;
	System.out.println("context destroyed");
    }
}
