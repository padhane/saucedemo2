package com.saucedemo.TestLayer;

import org.testng.annotations.Test;

import com.saucedemo.BaseLayer.BaseClass;
import com.saucedemo.PageLayer.ProductPage;

@Test(groups = { "ProductPage", "RegressionTesting" }, dependsOnGroups = { "LoginPage" })
public class ProductPageTest extends BaseClass {
	private ProductPage productPage;

	@Test
	public void validateProductOrder() {
		productPage = new ProductPage();
		productPage.displayProductAsPerIndexOrder(3);
	}

}
