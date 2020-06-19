package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");		
		WebDriver a= new ChromeDriver();
		a.get("http://www.amazon.ca");
		Select s= new Select(a.findElement(By.id("searchDropdownBox")));
		s.selectByIndex(7);
	}

}
