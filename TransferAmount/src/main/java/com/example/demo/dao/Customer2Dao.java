package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.WalletAccount;
import com.example.demo.entity.WalletTransactions;


 
/*@Repository
public interface Customer2Dao  extends JpaRepository<WalletTransactions, Integer> {

	@Modifying
	@Transactional
	@Query("update WalletTransactions e set e.account_balance=?1 e.amount=?2 e.description=?3 where e.account_Id=?4")
	void updateacc1(@Param("C")Double h, @Param("C")Double amount, @Param("C")String s1, @Param("C")Integer accid1);

	
	@Modifying
	@Transactional
	@Query("update WalletTransactions e set e.account_balance=?1 e.amount=?2 e.description=?3 where e.account_Id=?4")
	void updateacc2(@Param("C")Double h, @Param("C")Double amount, @Param("C")String s2, @Param("C")Integer accid2);


		}*/

