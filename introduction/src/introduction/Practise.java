
package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\driver\\\\chromedriver.exe");
		WebDriver c= new ChromeDriver();
		c.get("https://www.google.ca/");
		System.out.println(c.getTitle());
		c.findElement(By.xpath("//input[@name='q']")).sendKeys("QTP");
		c.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		c.quit();
		
	}
}
