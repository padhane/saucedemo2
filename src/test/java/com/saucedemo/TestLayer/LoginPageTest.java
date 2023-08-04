package com.saucedemo.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.saucedemo.BaseLayer.BaseClass;
import com.saucedemo.PageLayer.LoginPage;

@Test(groups= {"LoginPage","RegressionTesting"})
public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@BeforeTest
	@Parameters({ "browsername" })
	public void setUp(String browsername) {
		initialization(browsername);
	}

	@Test
	public void validateLoginFunctionality() {
		loginpage = new LoginPage();
		loginpage.loginFunctionality("standard_user", "secret_sauce");
	}
	
	@AfterTest
	public void tearDown()
	{
		//getDriver().quit();
	}
}
