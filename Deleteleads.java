package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deleteleads {

	public static void main(String[] args) throws InterruptedException {
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
		Driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']//span)[2]")).click();
		Driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		String text = Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Driver.findElement(By.linkText("Find Leads")).click();
		Driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		

	}

}
