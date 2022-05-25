package employeeservice;

import java.sql.*;

public class EmployeeService implements implementation {

	@Override
	public void getAllEmployee() {
		String query1 = "select * from employee";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root",
					"Pankajd@1999");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query1);

			while (rs.next()) {
				int e_id = rs.getInt("e_id");
				String Name = rs.getString("e_name");
				int age = rs.getInt("age");
				String salary = rs.getString("salary");
				System.out.println(e_id + " " + Name + " " + age + " " + salary);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getEmployeeSalary() {
		String query1 = "select * from employee group by salary having salary>20000";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root",
					"Pankajd@1999");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query1);
			while (rs.next()) {
				int e_id = rs.getInt("e_id");
				String Name = rs.getString("e_name");
				int age = rs.getInt("age");
				String salary = rs.getString("salary");
				System.out.println(e_id + " " + Name + " " + age + " " + salary);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateEmployee() {
		try {
			String url = "jdbc:mysql://localhost:3306/mindtree";
			String uname = "root";
			String pass = "Pankajd@1999";

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);

			String query = "update employee set salary=35000 where e_id=1";
			PreparedStatement preparedStatement = con.prepareStatement(query);

			preparedStatement.executeUpdate();
			
			System.out.println("updated.....");

			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

interface implementation {
	
	void getEmployeeSalary();

	void getAllEmployee();
	
	void updateEmployee();
}
