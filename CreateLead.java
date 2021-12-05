package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RBS");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sriram");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		WebElement findElement = Driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select slt = new Select(findElement);
		slt.selectByVisibleText("Employee");
		Driver.findElement(By.className("smallSubmit")).click();
		String text = Driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(text);
		String title2 = Driver.getTitle();  // to get the title of the page / URL.
		System.out.println(title2);
		Driver.close();
		}
	}
