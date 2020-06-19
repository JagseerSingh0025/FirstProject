import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");		
		WebDriver b= new ChromeDriver();
		b.get("http://qaclickacademy.com/practice.php");
		WebElement mini= b.findElement(By.xpath("//td[1]//ul[1]"));
		int s=mini.findElements(By.tagName("a")).size();
		//System.out.print(s);
		for(int i=1;i<s;i++) {
			String dob=Keys.chord(Keys.CONTROL,Keys.ENTER);
			mini.findElements(By.tagName("a")).get(i).sendKeys(dob);
			
		}
		Set<String> id=b.getWindowHandles();
		
	Iterator<String> it	=id.iterator();
	while(it.hasNext()) {
		String index=it.next();
		b.switchTo().window(index);
	System.out.println(b.getTitle());

	}
		

	}

}
