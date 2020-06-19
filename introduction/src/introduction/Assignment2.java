package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.cleartrip.com/");
		b.findElement(By.id("OneWay")).click();
		Thread.sleep(5000);
		WebElement e = b.findElement(By.id("FromTag"));
		Thread.sleep(1000);
		e.click();
		e.sendKeys("bom");
		Thread.sleep(5000);
		e.sendKeys(Keys.ENTER);
		b.findElement(By.id("ToTag")).sendKeys("chandi");
		Thread.sleep(5000);
		b.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		b.findElement(By.id("DepartDate")).click();
		b.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		Select s = new Select(b.findElement(By.id("Adults")));
		s.selectByValue("2");
		Select d = new Select(b.findElement(By.id("Childrens")));
		d.selectByValue("2");
		b.findElement(By.xpath("//i[@class='rArrow blue']")).click();
		Thread.sleep(5000);
		b.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Air India");
		b.findElement(By.id("SearchBtn")).click();
		System.out.println(b.findElement(By.id("homeErrorMessage")).getText());
	}

}
