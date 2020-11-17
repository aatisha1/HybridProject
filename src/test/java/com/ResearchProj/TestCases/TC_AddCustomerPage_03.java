package com.ResearchProj.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.ResearchProj.PageObjects.AddCustomerPage;
import com.ResearchProj.PageObjects.LoginPage;

public class TC_AddCustomerPage_03 extends BaseClass{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		//Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		
		
		logger.info("providing customer details....");
		
		
		addcust.custName("charlie");
		addcust.custgender("male");
		addcust.custdob("10","08","1991");
		Thread.sleep(5000);
		addcust.custaddress("NZ");
		addcust.custcity("AUCKLAND");
		addcust.custstate("AUC");
		addcust.custpinno("232334");
		addcust.custtelephoneno("9877656658");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
}
