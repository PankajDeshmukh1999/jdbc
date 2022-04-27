package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.PhoneDao;

import dbutil.DbUtil;

public class PhoneDaoImpl implements PhoneDao {

	@Override
	public void getAllPhone() throws Exception {
		DbUtil dbUtil = new DbUtil();

		Connection con = dbUtil.myConnection();
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from phone");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
//			con.close();
		}

	}

	@Override
	public boolean updatePrice(int id, int price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getByPrice() {
		DbUtil dbUtil = new DbUtil();
		try {
			Connection con = dbUtil.myConnection();
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from phone where price>30000 group by price");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void getUpdatePrice() throws Exception {
		DbUtil dbUtil = new DbUtil();
		String query = "update phone set price=25000 where id=2";
		
		Connection con = dbUtil.myConnection();
		PreparedStatement st = con.prepareStatement(query);
		
		st.executeUpdate();
		
		System.out.println("Updated successfully .......");
		
	}

}
