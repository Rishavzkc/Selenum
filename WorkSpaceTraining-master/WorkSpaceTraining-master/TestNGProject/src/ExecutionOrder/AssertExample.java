package ExecutionOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {

	@Test
	public void testOne(){
		System.out.println("Hi, I am Test One .....");
		Assert.assertEquals("FaceBook", "FaceBook");
	}
	
	@Test 
	public void testTwo(){
		
		Assert.assertEquals(404, 200);
		System.out.println("Hi, I am Test Two .....");
	}
	
	@Test 
	public void testThree(){
		System.out.println("Hi, I am Test Three .....");
	   Assert.assertTrue(true);
		
	}
	
	@Test 
	public void testFour(){
		System.out.println("Hi, I am Test Four .....");
	Assert.assertTrue(false,"Making test Faliure");
	}
	
	@Test
	public void testFive(){
		System.out.println("Hi, I am Test Five .....");
	}
	
	@Test 
	public void testSix(){
		System.out.println("Hi, I am Test Sixs .....");
		
	}
}