package zoho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch_spice_jet_2 {
@Test
	public void lo() {
	//public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver  driver =new ChromeDriver();
       driver.get("https://www.google.co.in/");
       driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//}
	}
}
