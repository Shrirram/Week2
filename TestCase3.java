package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
		WebElement element2 = Driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select slt1 = new Select(element2);
		slt1.selectByVisibleText("Automobile");	
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("shrilocal");
		Driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("N local");
		Driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
		Driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/4/95",Keys.TAB,Keys.TAB);
		Driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestRun1");
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		Driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		
		WebElement element3 = Driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select slt2 = new Select(element3);
		slt2.selectByVisibleText("INR - Indian Rupee");
		
		WebElement element4 = Driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select slt3 = new Select(element4);
		slt3.selectByVisibleText("Finance");
		
		Driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		WebElement element5 = Driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select slt4 = new Select(element5);
		slt4.selectByVisibleText("Sole Proprietorship");
		
		Driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Code1");
		
		Driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("A");
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("Test run 1");
		Driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("No Notes");
		
		
		//Contact tab
		
		Driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("044");
		Driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		Driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6345435");
		Driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("ram1");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sriram@testleaf.com");
		Driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.google.co.in/");
		
		//Primary Address tab
		
		Driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Name1");
		Driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Name2");
		Driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 45 bvc street");
		Driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("tbm");
		Driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Georgetown");
		
		WebElement element6 = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select slt6 = new Select(element6);
		slt6.selectByVisibleText("Florida");
		
		Driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600028");
		
		WebElement element7 = Driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select slt7 = new Select(element7);
		slt7.selectByVisibleText("India");
		
		Driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("28");
		Driver.findElement(By.className("smallSubmit")).click();
		
		String text = Driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		String title2 = Driver.getTitle();  // to get the title of the page / URL.
		System.out.println(title2);
		Driver.close();
		}
	}
