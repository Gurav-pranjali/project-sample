package com.anurag.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anurag.demo.entity.WalletUser;


 
@Repository
public interface CustomerDao  extends JpaRepository<WalletUser, Integer> {
	

	}

