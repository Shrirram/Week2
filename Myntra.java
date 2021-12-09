package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("https://www.myntra.com/");
		Driver.manage().window().maximize(); // TO maximise a window 
		
		Driver.findElement(By.xpath("//div[@class='desktop-query']/input")).sendKeys("Jeans",Keys.ENTER);		
		
		Driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/div")).click();
				
	}

}
