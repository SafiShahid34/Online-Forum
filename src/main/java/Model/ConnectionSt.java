package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSt {
	
	public Connection ConnectDots() {
    	String url = "jdbc:mysql://localhost:3306/usermess?useSSL=false";
    	Connection con = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Worked!");
    	}catch(ClassNotFoundException e){
    		e.printStackTrace();
    		System.out.println("XXX");
    	}
    	
    	try {
    		con = DriverManager.getConnection(url, "root", "password");
    		System.out.println("okok");
    	}catch(SQLException e){
    		System.out.println("X");
    		e.printStackTrace();
    	}
    	return con;
    }
}
