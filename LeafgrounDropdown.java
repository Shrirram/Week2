package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgrounDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		//  To launch URL
		Driver.get("http://leafground.com/pages/Dropdown.html");
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement el1 = Driver.findElement(By.xpath("//div[@class='example']/select"));
		
		Select sl1 = new Select(el1);
		
		int size = sl1.getOptions().size();
		sl1.selectByIndex(size-2);
	}

}
