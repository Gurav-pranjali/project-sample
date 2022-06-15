package com.example.LoginValidation.service;

import com.example.LoginValidation.entity.WalletAccount;
import com.example.LoginValidation.entity.WalletUser;

public interface CustomerService {

	WalletUser validateUser(Integer cusId, String cusPassword);
	



}
