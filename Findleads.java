package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findleads {

	public static void main(String[] args) {
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
		Driver.findElement(By.linkText("Find Leads")).click();
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		

	}

}
