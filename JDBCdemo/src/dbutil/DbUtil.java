package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtil {
	
	Connection con =null;
	Statement st = null;
	ResultSet rs = null;
	String uname="root";

	public Connection  myConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",uname,"Pankajd@1999");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
