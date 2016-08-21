package com.hand.springMVCExam.service;

import java.util.List;

import com.hand.springMVCExam.bean.Address;

public interface AddressManageService {
	public List<Address> getAllAddress();
	public int getAddressId(String address);

}
