package zoho;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynaic_elemnt {

	public static void main(String[] args) {
	 int a[]= {1,5,6,1,4,5,5};
	 for(int i=0;i<a.length-1;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if(a[i]==a[j] ){
				System.out.println(a[i]); 
			 }
		 }
	 }
	}

}
