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

@SpringBootTest
public class TransferAmountApplicationTests {

	@Test
	public void testGetTransferSuccess() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:2023/Wallet/transferAmount";
	    URI uri = new URI(baseUrl);
	    
	    Double amount=20.0; 
	    Integer cusId1=2;
	    Integer cusId2=5;
		
		
		    WalletAccount w = new WalletAccount();
       w.setAccount_Balance(20.0);
       
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");      
        HttpEntity<WalletAccount> request = new HttpEntity<>(w, headers);
        
        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(w);
	}
	
	
	
}
	
	
	
	
	
	
	/*@Autowired
	public EmpRestController controller ;
	
	
	
	@Test(expected=NullPointerException.class)
	public void getbalance()  {
		
		/*WalletAccount w=new WalletAccount();
		w.getWalletUser().setUser_Name("vaishnavi");
		w.getWalletUser().setPassword("vaishu");
		w.getWalletUser().setPhone_Number("7788445566");
		w.getWalletUser().setLogin_Name("vaishu12");
	
		Double amount=100.0;
		Integer cusId1=2;
		Integer cusId2=5;		
     	String b= controller.updateEmp(amount, cusId1, cusId2);
     	String s="Amount "+amount+" transfered successfully from account of UserId "+ cusId1+" to "+cusId2;         
     	String s1="hii";
	assertEquals(s,b);
	
	}



	public TransferAmountApplicationTests() {
		super();
	
		}*/
	