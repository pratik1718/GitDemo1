package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//TESTNG XML FILE FROM MAVEN how to execute all test case from test folder - mvn test 
	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
		System.out.println("BrowserAutomation1");
	}
	
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}

	@Test
	public void deleteTwitter1()
	{
		System.out.println("Delete Twitter");
	}
}


