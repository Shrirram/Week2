package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UipathLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("https://acme-test.uipath.com/login");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		Driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
		
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Driver.close();
	
	}
	

}
