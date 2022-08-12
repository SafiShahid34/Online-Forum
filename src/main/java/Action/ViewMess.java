package Action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Base;
import Model.ConnectionSt;


/**
 * Servlet implementation class ViewMess
 */
@WebServlet("/ViewMess")
public class ViewMess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 
	
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ConnectionSt u = new ConnectionSt();
		Connection con = u.ConnectDots();
		String query = "select Mnumber, Dname, Messege from uuu";
		ArrayList<Base> P = new ArrayList<Base>();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				Base ok = new Base();
				ok.setId(rs.getInt("Mnumber"));
				ok.setName(rs.getString("Dname"));
				ok.setMess(rs.getString("Messege"));
				
				P.add(ok);
			}
			
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("data", P);
		RequestDispatcher rd =                  
	             request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		//response.sendRedirect(request.getContextPath() + "/display.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
