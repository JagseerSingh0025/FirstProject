package aa;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Second {
	private static Logger log=LogManager.getLogger(Second.class.getName());
	@Test
	public void Method3() {
		log.debug("log1");
		log.error("error");
		log.info("info");
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.google.ca/");
		Actions a= new Actions(b);	
		a.moveToElement(b.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
		String j=b.getTitle();
		System.out.println(j);

	}

}
