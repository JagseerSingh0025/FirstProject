package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.amazon.ca");
		Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4");
		Driver.findElement(By.className("nav-input")).click();
		Driver.findElement(By.linkText("Playstation 4 - 1TB Slim - Console Edition")).click();
		Driver.findElement(By.xpath("//*[@id=\'a-autoid-11-announce\']")).click();
		Driver.findElement(By.xpath("//*[@id=\'add-to-cart-button\']")).click();
		Driver.findElement(By.xpath("//*[@id='hlb-ptc-btn-native']")).click();
		System.out.println(Driver.findElement(By.xpath("//*[@id=\'authportal-main-section\']/div[2]/div/div/form/div/div/div/div[1]/label")).getText());
		Driver.close();
		
	}

	

}
