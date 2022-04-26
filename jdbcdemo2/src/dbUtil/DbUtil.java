package dbUtil;

import java.sql.*;

public class DbUtil {

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public Connection myConnection() throws Exception {
		String uname="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree",uname,"Pankajd@1999");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
