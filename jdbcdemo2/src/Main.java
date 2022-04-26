import com.employeeserviceimpl.EmployeeServiceImpl;

import com.employeeservice.*;

public class Main {

	public static void main(String[] args) {
		EmployeeService obj = new EmployeeServiceImpl();
		obj.getAllEmployee();
	}

}
