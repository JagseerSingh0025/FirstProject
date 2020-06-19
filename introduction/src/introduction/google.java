package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","webdriver.chrome.driver");
		ChromeDriver d1= new ChromeDriver();
		d1.get("http://google.ca");
		//d1.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("HP elitebook");
		d1.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("punjab");
		d1.findElement(By.xpath("//*[text()='Images']")).click();
		//d1.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
	}

}
