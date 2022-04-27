package com.service;

public interface PhoneService {
	
	void getAllPhone() throws Exception;
	
	boolean updatePrice(int id, int price);

	void getByPrice();
	
	void getUpdatePrice();

}
