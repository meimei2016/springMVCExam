package com.hand.springMVCExam.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hand.springMVCExam.bean.Address;
import com.hand.springMVCExam.service.AddressManageService;
import com.hand.springMVCExam.jdbc.dao.AddressDao;

public class AddressManageServiceImpl implements AddressManageService {
	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> getAllAddress() {
		 List<Address> list=addressDao.getAllAddress();
		return list;
	}

	@Override
	public int getAddressId(String address) {
		int addressId=addressDao.getAddressId(address);
		return addressId;
	}

}
