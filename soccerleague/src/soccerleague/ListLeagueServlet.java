package soccerleague;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListLeagueServlet
 */
@WebServlet("/list_leagues.view")
public class ListLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<League> leagueList=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListLeagueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text.html");
		PrintWriter out=response.getWriter();
		
		
		leagueList=(List<League>) getServletContext().getAttribute("leaguelist");
		/*leagueList.add(new League("world cup",2019,"Spring"));
		leagueList.add(new League("summer volley",2018,"Summer"));
		leagueList.add(new League("winter BasketBall",2017,"Winter"));*/
		String pageTitle="Duke's Soccer LEague:List Leagues";
		
		response.setContentType("text/html");
		PrintWriter out1=response.getWriter();
		
		out1.println("<html>");
		out1.println("<head>");
		out1.println("<title>"+pageTitle+"</title>");
		out1.println("</head>");
		out1.println("<body>");
		
		out1.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
		out1.println("<tr bgcolor='#CCCFF' align='center' align='center' height='20'>");
		out1.println("<td><h3>"+pageTitle+"<h3></td>");
		out1.println("</tr>");
		out1.println("</table>");
		
		out1.println("<p>");
		out1.println("The set of soccer leagues are:");
		out1.println("</p>");
		
		out1.println("<ul>");
		Iterator items=leagueList.iterator();
		while(items.hasNext()) {
			League league=(League) items.next();
			out1.println("<li>"+league.getTitle()+"</li>");
		}
		out1.println("</ul>");
		
	    out1.println("</body>");
	    out1.println("</html>");
		}
		
}
