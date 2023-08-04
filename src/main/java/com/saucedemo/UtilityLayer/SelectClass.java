package com.saucedemo.UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.BaseLayer.BaseClass;

public class SelectClass extends BaseClass{

	public static void selectByVisibleText(WebElement wb,String valye)
	{
		Select sel =new Select(wb);
		sel.selectByVisibleText(valye);
	}
	
	public static void selectByIndex(WebElement wb,int index)
	{
		Select sel =new Select(wb);
		sel.selectByIndex(index);
	}
	
}
