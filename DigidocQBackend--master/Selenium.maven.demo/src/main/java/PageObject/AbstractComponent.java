package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear(WebElement findBy) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	public void waitForElementToDissappear(WebElement elm) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.invisibilityOf(elm));
	}
	
	@FindBy(css ="[routerlink *='cart']")
	WebElement cartHeader;
	
	@FindBy(css ="[routerlink *='myorders']")
	WebElement orderHeader;
	
	public CartPage gotocart() {
		cartHeader.click();
		CartPage cartPage =new CartPage(driver); 
		return  cartPage ;
	}
	
	public OrderPage gotoOrderPage() {
		orderHeader.click();
		OrderPage orderPage =new OrderPage(driver); 
		return  orderPage ;
	}
}
