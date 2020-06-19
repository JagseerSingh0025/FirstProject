package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\driver\\\\chromedriver.exe");
		WebDriver c= new ChromeDriver();
		int i=0;
		c.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		c.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		Thread.sleep(2000);
		JavascriptExecutor j= (JavascriptExecutor)c;
		String Sc="return document.getElementById(\"autocomplete\").value;";
		String text=(String) j.executeScript(Sc);
		while(!text.equalsIgnoreCase("United Kingdom (UK)")) {
			c.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text=(String) j.executeScript(Sc);
			//System.out.println(text);
			i++;
			if(i>10) {
				System.out.println("Element not found");
				break;
			}
			
			
		}
		System.out.println("element found on "+i+"th index");
		System.out.print(text);
		c.close();
	}

}
