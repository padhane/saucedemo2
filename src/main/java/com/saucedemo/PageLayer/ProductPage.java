package com.saucedemo.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.BaseLayer.BaseClass;
import static com.saucedemo.UtilityLayer.SelectClass.*;

public class ProductPage extends BaseClass{

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpack;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bike_light;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement tshirt;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement jacket;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement onesie;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement tshirtred;

	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement productsort;
	
	@FindBy(id="shopping_cart_container")
	private WebElement shopping_cart_container;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menubutton;
	
	@FindBy(id="inventory_sidebar_link")
	private WebElement allItems;
	
	@FindBy(id="about_sidebar_link")
	private WebElement about;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logout;
	
	@FindBy(id="reset_sidebar_link")
	private WebElement resetAppState;
	
	public ProductPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void displayProductAsPerVisibleOrder(String order)
	{
		selectByVisibleText(productsort, order);
	}
	
	public void displayProductAsPerIndexOrder(int index)
	{
		selectByIndex(productsort, index);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
