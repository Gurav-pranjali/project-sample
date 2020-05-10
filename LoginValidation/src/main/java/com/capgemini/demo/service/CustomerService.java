package com.capgemini.demo.service;

import com.capgemini.demo.entity.WalletAccount;
import com.capgemini.demo.entity.WalletUser;

public interface CustomerService {

	WalletUser validateUser(Integer cusId, String cusPassword);
	



}
