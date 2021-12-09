package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("https://en-gb.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sriraam");
		Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nr");
		Driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sri89@gmail.com");
		Driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sri89@gmail.com");
		Driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dert234");
		
		WebElement day = Driver.findElement(By.id("day"));
		Select slt1 = new Select(day);
		slt1.selectByVisibleText("2");
		
		WebElement month = Driver.findElement(By.id("month"));
		Select slt2 = new Select(month);
		slt2.selectByVisibleText("Feb");
		
		WebElement year = Driver.findElement(By.id("year"));
		Select slt3 = new Select(year);
		slt3.selectByVisibleText("1996");
		
		Driver.findElement(By.xpath("//input[@name='sex']")).click();
		Driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	
	}
	

}
