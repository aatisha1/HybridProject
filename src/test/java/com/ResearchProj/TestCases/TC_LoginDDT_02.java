 package com.ResearchProj.TestCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ResearchProj.PageObjects.LoginPage;
import com.ResearchProj.Utilities.XLUtils;

public class TC_LoginDDT_02 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String uname, String pwd) throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("username provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warning("login failed");
		}
		else {
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.clickLogout();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/ResearchProj/TestData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colnum=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colnum];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colnum;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
