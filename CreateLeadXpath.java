package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
		// To download & Setup chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("http://leaftaps.com/opentaps");
		Driver.manage().window().maximize(); // TO maximise a window 
		String title = Driver.getTitle();  // to get the title of the page / URL.
		System.out.println(title);
		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		Driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		Driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("RBS");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("srirram");
		Driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("nr");
		
		Driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Driver.close();
		}
	}
