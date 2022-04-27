package com.service.impl;

import com.dao.PhoneDao;
import com.dao.impl.PhoneDaoImpl;
import com.service.PhoneService;

public class PhoneServiceImpl implements PhoneService{
	PhoneDao phoneDao = new PhoneDaoImpl() ;
		
		@Override
		public boolean updatePrice(int id, int price) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void getAllPhone() throws Exception {
			try {
				phoneDao.getAllPhone();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public void getByPrice() {
			try {
			phoneDao.getByPrice();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void getUpdatePrice() {
			try {
				phoneDao.getUpdatePrice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}




}
