package client;

import employeeservice.EmployeeService;

public class Client {

	public static void main(String[] args) {
		EmployeeService obj = new EmployeeService();
		obj.getAllEmployee();
//		obj.getEmployeeSalary();
//		obj.updateEmployee();
	}

}
