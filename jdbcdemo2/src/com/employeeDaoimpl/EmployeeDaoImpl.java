package com.employeeDaoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employeeDao.EmployeeDao;

import dbUtil.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void getAllEmployee() {
		DbUtil dbUtil = new DbUtil();
		
		Connection con = null;
		Statement st = null;
		try {
			con = dbUtil.myConnection();
			 st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "
						+rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
