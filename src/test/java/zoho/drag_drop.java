package zoho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement cl = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
	WebElement po = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));

	Actions ac=new Actions(driver);
	ac.dragAndDrop(cl, po).perform();
	}

}
