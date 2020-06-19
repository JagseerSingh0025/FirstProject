package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("http://qaclickacademy.com/practice.php");
		b.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		String s = b.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		System.out.println(s);
		Select dropdown = new Select(b.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropdown.selectByVisibleText(s);
		b.findElement(By.xpath("//input[@id='name']")).sendKeys(s);
		Thread.sleep(3000);
		b.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		System.out.println(b.switchTo().alert().getText());
		Thread.sleep(3000);
		String text=b.switchTo().alert().getText();
		if(text.contains(s))
		{
			System.out.println("Yaa baby");
		}
		else {
			System.out.println("na baby");
		}
		b.switchTo().alert().accept();
	

	}
}