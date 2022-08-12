package Action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

import javax.print.attribute.DateTimeSyntax;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ConnectionSt;



/**
 * Servlet implementation class LogCheck
 */
@WebServlet("/LogCheck")
public class LogCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int ok = 1;

	Connection con = null;
    public LogCheck() {
        // TODO Auto-generated constructor stub
    }
    
    public String Now() {    
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
    	LocalDateTime now = LocalDateTime.now();  
    	return dtf.format(now);  
    }   
    
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ConnectionSt u = new ConnectionSt();
		Connection A = u.ConnectDots();
		String n = request.getParameter("t1");
		String m = request.getParameter("t2");
		ok = ok + 1;
		String sql = "insert into uuu values( "+(Math.random()*100000)+", '"+n+"', '"+m+"')";
		System.out.println(sql);
		try {
			Statement stm = A.createStatement();
			stm.executeUpdate(sql);
			stm.close();
			A.close();
			u = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
