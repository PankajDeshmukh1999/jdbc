package com.dao;

public interface PhoneDao {

	void getAllPhone() throws Exception;
	
	boolean updatePrice(int id, int price );
	
	void getByPrice();
	
	void getUpdatePrice() throws Exception;
	
}
