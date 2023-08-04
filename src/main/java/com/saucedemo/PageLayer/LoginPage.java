package com.saucedemo.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.BaseLayer.BaseClass;
import static com.saucedemo.UtilityLayer.UtilsClass.*;

public class LoginPage extends BaseClass{

	//Object Repository - OR
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	//initialize the OR in current class
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	//Associated functionality Methods
	public void loginFunctionality(String Username,String Password)
	{
		sendKeys(username, Username);	
		sendKeys(password, Password);
		click(loginbutton);
	}
	
}
