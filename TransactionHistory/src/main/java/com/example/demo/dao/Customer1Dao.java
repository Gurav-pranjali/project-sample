package com.example.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WalletAccount;

 
@Repository
public interface Customer1Dao  extends JpaRepository<WalletAccount, Integer> {


	
	@Query("select e from WalletAccount e where e.WalletUser.userId=?1")
	WalletAccount getdetails(@Param("C")Integer cusId1);
	

	}

