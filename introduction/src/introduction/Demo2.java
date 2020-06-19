package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
WebDriver Driver2= new ChromeDriver();
Driver2.get("http:\\www.rediff.com/");
Driver2.findElement(By.cssSelector("a[title*='Sign in']")).click();
Driver2.findElement(By.cssSelector("input[id*='login1']")).sendKeys("1234567");
Driver2.findElement(By.cssSelector("input#password")).sendKeys("789101112");
Driver2.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
