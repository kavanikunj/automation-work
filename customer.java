package guru;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			
			driver.manage().window().maximize();
		    
			driver.findElement(By.name("cusid")).sendKeys("11");
			driver.findElement(By.name("submit")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		
		
	}

}
