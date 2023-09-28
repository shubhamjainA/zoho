package zoho;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class add {
public void add() throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
  op.addArguments("--remote-allow-origins=*");
  WebDriver driver=new ChromeDriver(op);
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click(); // close the pop up
 driver.findElement(By.name("q")).sendKeys("iphone");  
 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
 Thread.sleep(2000);
   Set<String> win = driver.getWindowHandles();
          Iterator<String> it = win.iterator();
         String main = it.next();
         String child = it.next();
              driver.switchTo().window(child)  ;  
              driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
              Thread.sleep(2000);
            JavascriptExecutor js = ((  JavascriptExecutor)driver);
            js.executeScript("scrollBy(0,1500)");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _3-J4S1\"]")).click();
            
            driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();
            
            File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                   File detination = new File("C:\\eclipse\\screenshot\\proctt.jpg");
                   org.openqa.selenium.io.FileHandler.copy(source, detination);
                   
                   
            
}
}
