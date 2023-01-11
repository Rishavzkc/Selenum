package Selenium.maven;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.BaseTest;
import PageObject.CartPage;
import PageObject.CheckoutPage;
import PageObject.ConfirmationPage;
import PageObject.OrderPage;
import PageObject.ProductCatlogue;

public class SubmitOrderTest extends BaseTest {
	String productName = "Zara coat 3";
WebDriver driver;
	@Test(dataProvider = "getData", groups = { "Purchase" })
	public void submitOrder(HashMap<String, String> input) throws InterruptedException, IOException {

		// LandingPage landingPage =launchApplication();
		ProductCatlogue productCatlogue = landingPage.loginApplication(input.get("email"), input.get("password"));

		// ProductCatlogue productCatlogue =new ProductCatlogue(driver) ;
		List<WebElement> products = productCatlogue.getProductList();
		productCatlogue.addProductToCart(input.get("productName"));
		CartPage cartPage = productCatlogue.gotocart();

		// CartPage cartPage =new CartPage(driver);
		Boolean Match = cartPage.verifyProductDisplay(input.get("productName"));
		Assert.assertTrue(Match);

		CheckoutPage checkoutPage = cartPage.gotoCheckout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String message = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(message.equalsIgnoreCase("THANKYOU FOR THE ORDER. "));

	}

	@Test(dependsOnMethods = { "submitOrder" })
	public void orderHistoryTest() {
		ProductCatlogue productCatlogue = landingPage.loginApplication("rishav@gmail.com", "Rk@123456");
		OrderPage orderPage = productCatlogue.gotoOrderPage();
		Assert.assertTrue(orderPage.verifyOrderDisplay(productName));

	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email", "rishav@gmail.com");
//		map.put("password", "Rk@123456");
//		map.put("productName", "Zara coat 3");
//
//		HashMap<String, String> map1 = new HashMap<String, String>();
//		map1.put("email", "shetty@gmail.com");
//		map1.put("password", "Iamking@000");
//	/	map1.put("productName", "ADIDAS ORIGINAL");

	List<HashMap<String, String>> data= 	getJsonDataToMap(System.getProperty("user.dir") + "\\src\\main\\java\\data\\PurchaseOrder.json");
		return new Object[][] { {data.get(0) }, { data.get(1) } };
	}

}
