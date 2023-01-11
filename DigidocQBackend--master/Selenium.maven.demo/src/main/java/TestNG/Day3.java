package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebloginCarLoan() {
		System.out.println("WebloginCarLoan");
	}
	@Test
public void MobileloginCarLoan() {
		System.out.println("MobileloginCarLoan");
	}
	@Test
public void LoginApiCarLoan() {
		System.out.println("LoginApiCarLoan");
}
	@BeforeTest
	public void First() {
			System.out.println("First code ");
	}
	
	@Test(groups= {"smoke"})
	public void Work() {
		System.out.println("Working");
	}
}
