package com.example.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WalletAccount;
import com.example.demo.entity.WalletUser;


 
@Repository
public interface CustomerDao  extends JpaRepository<WalletAccount, Integer> {
	

	}

