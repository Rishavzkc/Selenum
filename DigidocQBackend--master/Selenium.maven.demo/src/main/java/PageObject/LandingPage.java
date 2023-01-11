package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage  extends AbstractComponent{

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail =driver.findElement(By.id("userEmail"));
	// page Factory

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement userPassword;

	@FindBy(css = "input[type ='submit']")
	WebElement submit;
	
	@FindBy(css="[class *='flyInOut']")
	WebElement errorMessage;

	public ProductCatlogue loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		submit.click();
		ProductCatlogue productCatlogue =new ProductCatlogue(driver) ;
		return  productCatlogue;
	}
public String getErrorMessage() {
	waitForWebElementToAppear(errorMessage);
	return errorMessage.getText();
}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
}
