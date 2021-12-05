package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		// To download & Setup chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("http://leaftaps.com/opentaps");
		Driver.manage().window().maximize(); // TO maximise a window 
		String title = Driver.getTitle();  // to get the title of the page / URL.
		System.out.println(title);
		Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Contacts")).click();
		Driver.findElement(By.linkText("Create Contact")).click();
		Driver.findElement(By.id("firstNameField")).sendKeys("Shrirram");
		Driver.findElement(By.id("lastNameField")).sendKeys("nr");
		Driver.findElement(By.className("smallSubmit")).click();
		String text = Driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(text);
		Driver.close();
		}
	}
