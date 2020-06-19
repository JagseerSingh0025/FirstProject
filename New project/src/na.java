import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class na {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\driver\\\\chromedriver.exe");
		WebDriver c= new ChromeDriver();
		c.get("https://www.makemytrip.com/");
		c.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]//label")).click();
		
	while(!c.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")).getText()
.contains("July")) {
			c.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
		}
		int count=c.findElements(By.className("DayPicker-Day")).size();
	for(int i=1;i<count;i++)
		{
			String date=c.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(date.equalsIgnoreCase("23")) {
				c.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}
			
		}

	}

}
