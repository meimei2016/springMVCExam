package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.Address;

public interface AddressDao {
	public List<Address> getAllAddress();
	public int getAddressId(String address);

}
