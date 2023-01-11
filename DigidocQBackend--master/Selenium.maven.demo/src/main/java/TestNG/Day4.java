package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Test(dataProvider = "getData")
	public void Manager(String username, String password) {
		System.out.println("Manager");
		System.out.println(username);
		System.out.println(password);
	}

	@Parameters({"URL"})
	@Test
	public void Employee(String urlname) {
		System.out.println("Employee");
		System.out.println(urlname);
	}
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = new Object [3][2];
		data [0][0]= "firstUsername";
		data [0][1]="firstpassword";
		
		data[1][0]= "secondUsername";
		data[1][1]= "secondpassword";
		
		data[2][0] = "thirdUsername";
		data[2][1]= "thirdpassword";
		
		return data;
	}
}
