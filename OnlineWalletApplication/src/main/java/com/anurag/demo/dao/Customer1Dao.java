package com.anurag.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anurag.demo.entity.WalletAccount;

 
@Repository
public interface Customer1Dao  extends JpaRepository<WalletAccount, Integer> {
	

	//addamount
	@Query("select e.account_Balance from WalletAccount e where e.user_Id=?1")
	Double getAmount(@Param("C")Integer cusId1);
	
	@Modifying
	@Transactional
	@Query("UPDATE WalletAccount w SET w.account_Balance = ?2 where w.user_Id=?1")
	Integer  updateAmount(@Param("C") Integer cusId, @Param("C") Double c);
	

	
	//displaybalance
	@Query("select e.account_Balance from WalletAccount e where e.user_Id=?1")
	Double findBalance(@Param("C")Integer cusId1);
	
	
	
	//transactionamount
	@Query("select e.account_Balance from WalletAccount e where user_Id=?1")
	Double getAmount1(@Param("userid")Integer cusId2);

	@Modifying
	@Transactional
	@Query("update WalletAccount w set w.account_Balance = ?2 where user_Id=?1 ")
	Integer updateAmount1(@Param("userid")Integer cusId2, @Param("balance") Double h);

	@Query("select e.account_Balance from WalletAccount e where user_Id=?1")
	Double getAmount2(@Param("userid")Integer cusId1);

	@Modifying
	@Transactional
	@Query("update WalletAccount w set w.account_Balance = ?2 where user_Id=?1 ")
	Integer updateAmount2(@Param("userid")Integer cusId1, @Param("balance") Double c);

	}

