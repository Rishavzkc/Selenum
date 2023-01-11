package Selenium.maven;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) throws InterruptedException {

		String productName = "Zara coat 3";
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client");

		driver.findElement(By.id("userEmail")).sendKeys("rishav@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Rk@123456");
		driver.findElement(By.cssSelector("input[type ='submit']")).click();

		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);

		// prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		driver.findElement(By.xpath("//*[@id='products']/div[1]/div[2]/div[1]/div/div/button[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink *='cart']")).click();

		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

		Boolean Match = cartProducts.stream()
				.anyMatch(cartProduc -> cartProduc.getText().equalsIgnoreCase(productName));

		Assert.assertTrue(Match);

		driver.findElement(By.xpath("//div/ul/li[3]/button")).click();

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build()
				.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		driver.findElement(
				By.xpath("//section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div/section/button[2]"))
				.click();
		Thread.sleep(5000);
		// driver.findElement(By.cssSelector(".action__submit")).click();
		driver.findElement(By.cssSelector("a[class='btnn action__submit ng-star-inserted']")).click();

		String message = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(message.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
		driver.close();
	}

}
