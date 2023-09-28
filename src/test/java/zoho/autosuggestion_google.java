package zoho;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion_google {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver  driver =new ChromeDriver();
       driver.get("https://demo.guru99.com/test/newtours/register.php");
       driver.manage().window().maximize();
       Thread.sleep(2200);
   WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
      
  Select s=new Select(country);
  s.selectByIndex(80);
       
       
      
	}

	
}
