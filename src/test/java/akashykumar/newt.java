package akashykumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newt {
	
@Test
	public void mo() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
 ChromeOptions op=new ChromeOptions();
 op.addArguments("--remote-allow-origins=*");
 WebDriver driver=new ChromeDriver(op);
 driver.manage().window().maximize();
  driver.get("https://www.mybookingsite.io/inst/#home?propertyId=563IjUNz7pnXYZSlKxRd3yrLy4emHM6PGLxMjY5OSI=&JDRN=Y");
  Thread.sleep(1000);
  driver.findElement(By.id("start-Date-Input")).click();
  
 
  driver.findElement(By.xpath("(//button[@class=\"rdrDay rdrDayToday\"]")).click();
  Thread.sleep(1000);
  
  List<WebElement>checkin=driver.findElements(By.cssSelector("span[class='rdrDayNumber'] "));
  
  for(int i=0; i<checkin.size();i++)
  {
	 String value= checkin.get(i).getText();
	 if(value.equalsIgnoreCase("26"))
	 {
		 checkin.get(i).click(); 
	 }
	 else
	 {
		 driver.findElement(null);
	 }
	 
  }
//  
//  driver.findElement(By.xpath(""));
//  driver.findElement(By.id("end-Date-Input")).click(); 

}}
