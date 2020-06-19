import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args)
			throws IOException{
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\driver\\\\chromedriver.exe");
		WebDriver c= new ChromeDriver();
	int s = 0;
		c.get("https://www.espncricinfo.com/series/19840/scorecard/1223277/grenadine-divers-vs-salt-pond-breakers-20th-match-vincy-premier-t10-league-2020");
	 WebElement table= c.findElement(By.xpath("//body/div[@id='__next']/section[@id='pane-main']/section[@id='main-container']/div[@class='match-page-wrapper']/div[@class='container']/div/div[@class='row']/div[@class='col-16 col-md-16 col-lg-12 main-content-x']/div[@class='match-body']/div[@class='match-scorecard-page']/div[1]/div[1]"));
	int count=table.findElements(By.className("font-weight-bold")).size();
	for(int i=1;i<count-2;i++) {
		String a=table.findElements(By.className("font-weight-bold")).get(i).getText();
		//System.out.print(a);
	int value= Integer.parseInt(a);
	s=s+value;
	
		
	}
	System.out.println(s);
	}

}
