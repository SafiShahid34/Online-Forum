package Action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogCheck
 */
@WebServlet("/LogCheck")
public class LogCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogCheck() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			String n = request.getParameter("t1");
			out.println("<br>");
			System.out.println(n);
			if(n.toString().equals("Safi")) {
				out.println("Hi " + n);
			} else {
				out.println("Hi Stranger");
			}
		}
		catch(Exception e) {
			out.println("ERROR!!!: " + e.getMessage());
		}
	}

}
