package TestNG;

import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void ploan() {
		System.out.println("Loan");
	}
	
	@Test
	public void HomeLoan() {
		System.out.println("Home Loan");
	}
	
	@Test(groups= {"smoke"})
	public void Join() {
		System.out.println("Joining");
	}
}
