package zoho;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_facebook {

	@Test(dataProvider="metho")
	public void test(String username,String password) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
	    op.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(op);
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      driver.findElement(By.id("email")).sendKeys();
	      driver.findElement(By.id("pass")).sendKeys();
	      driver.findElement(By.xpath("//button[@name='login']")).click();
	      
	      Thread.sleep(1000);
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			 
			 File dest = new File("C:\\eclipse\\screenshot\\.jpg"); 
			 
		 org.openqa.selenium.io.FileHandler.copy(src, dest); 
	      
	    //  driver.close();

	}
	@DataProvider (name="metho")
	public Object[][] dataset()
	{
		return new Object[][]
				{
			{"test","secret_pooo99"},
			
				};
	}}

