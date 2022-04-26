package com.employeeserviceimpl;

import com.employeeDao.EmployeeDao;
import com.employeeDaoimpl.EmployeeDaoImpl;
import com.employeeservice.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = new EmployeeDaoImpl(); 
	
	@Override
	public void getAllEmployee() {
		try {
			employeeDao.getAllEmployee();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
