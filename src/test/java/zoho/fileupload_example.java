package zoho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver=new ChromeDriver();  
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).click();
		
		driver.switchTo().frame(4);
		Thread.sleep(2000);
		WebElement po = driver.findElement(By.xpath("(//span[@class=\"field_title\"])[7]"));
		System.out.println(po.getText());
		driver.findElement(By.xpath("//input[@class=\"upload_txt\"]")).click();
	        // Locate the file input element by its ID or other suitable locator
	   //     WebElement fileInput = driver.findElement(By.id("uploadfile_0"));

	        // Specify the file path you want to upload
	      //  String filePath = "path/to/your/file.txt"; // Replace with the actual file path

	        // Use sendKeys to set the file path in the input element
	      //  fileInput.sendKeys(filePath);

	}

}
