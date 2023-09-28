package zoho;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emible_report {
	@Test
	public void TC0()
	{
	System.out.println("Running Test Case 0");
	}
	//Scenario 2 : Use of Reporter.log(, true);
	@Test
	public void TC1()
	{
	Reporter.log("Running TC1", true);
	}
	//Scenario 3 : Use of Reporter.log(, false/ Null);
	@Test(timeOut=5000)
	public void TC2() throws InterruptedException
	{
	Reporter.log("Running TC2", false);
Thread.sleep(1000);
	}
	@Test
	public void TC3()
	{
	Reporter.log("Running TC3", true);
	}
	@Test
	public void TC4()
	{
	Reporter.log("Running TC4" );
	}

}
