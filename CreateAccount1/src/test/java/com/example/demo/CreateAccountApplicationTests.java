package com.example.demo;


import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.controller.EmpRestController;
import com.example.demo.entity.WalletAccount;

//@SpringBootTest
//public class CreateAccountApplicationTests {
	
	//@Autowired
	//public EmpRestController controller ;
	
	
	
	/*import java.net.URI;
	import java.net.URISyntaxException;

	import org.junit.jupiter.api.Test;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.http.HttpEntity;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.client.RestTemplate;

	import com.cap.anurag.entities.DiagnosticCentre;

	import junit.framework.Assert;*/

	@SuppressWarnings("deprecation")
	@SpringBootTest
	public class CreateAccountApplicationTests {

		@Test(expected=NullPointerException.class)
		public void testGetCreateAccountApplicationSuccess() throws URISyntaxException 
		{
		    RestTemplate restTemplate = new RestTemplate();
		     
		    final String baseUrl = "http://localhost:2020/Wallet/createAccount";
		    URI uri = new URI(baseUrl);
		 
		    WalletAccount w=new WalletAccount();
			w.getWalletUser().setUser_Name("vaishnavi");
			w.getWalletUser().setPassword("vaishu");
			w.getWalletUser().setPhone_Number("7788445566");
			w.getWalletUser().setLogin_Name("vaishu12");
	        
	        HttpHeaders headers = new HttpHeaders();
	        headers.set("X-COM-PERSIST", "true");      
	        HttpEntity<WalletAccount> request = new HttpEntity<>(w, headers);
	        
	        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		    Assert.assertEquals(200, result.getStatusCodeValue());
		    Assert.assertNotNull(w);
		}	
	
		@Test(expected=NullPointerException.class)
		public void testGetCreateAccountApplicationFail() throws URISyntaxException
		{
		RestTemplate restTemplate = new RestTemplate();
		   
		final String baseUrl = "http://localhost:2020/Wallet/createAccount";
		URI uri = new URI(baseUrl);
		 WalletAccount w=new WalletAccount();
			w.getWalletUser().setUser_Name("vaishnavi");
			w.getWalletUser().setPassword("vaishu");
			w.getWalletUser().setPhone_Number("7788445566");
			w.getWalletUser().setLogin_Name("vaishu12");
		   HttpHeaders headers = new HttpHeaders();
		   headers.set("X-COM-PERSIST", "true");      
		   HttpEntity<WalletAccount> request = new HttpEntity<>(w, headers);
		   
		   ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		   Assert.assertEquals(302, result.getStatusCodeValue());
		   Assert.assertNotNull(w);
		}
	}
	
	
	
	
	
	
	/*Test(expected=NullPointerException.class)
	public void getbalance()  {
		
		WalletAccount w=new WalletAccount();
		w.getWalletUser().setUser_Name("vaishnavi");
		w.getWalletUser().setPassword("vaishu");
		w.getWalletUser().setPhone_Number("7788445566");
		w.getWalletUser().setLogin_Name("vaishu12");
	
     	String b= controller.CreateAccount(w);
     	String s="Customer Account Created Successfully";
     	String s1="hii";
	assertEquals(s,b);
	
	}



	public CreateAccountApplicationTests() {
		super();
	
	}
	}*/

