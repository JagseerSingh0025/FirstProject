package introduction;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");		
		WebDriver b= new ChromeDriver();
		b.get("http://qaclickacademy.com/practice.php");
		WebElement d= b.findElement(By.id("checkBoxOption1"));
		for(int c=0;c<2;) {
			c++;
			d.click();
			System.out.println(d.isSelected());
			Thread.sleep(2000);
			}
		System.out.println("number of checkboxes are"+b.findElements(By.xpath("//input[@type='checkbox']")).size());
		System.out.println(b.findElement(By.id("openwindow")).getText());
		File src=((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Camera Roll\\screenshot.png"));
		b.close();
		}
		

	}


