package Practical.RealProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
			public LoginPage(WebDriver driver1) 
		
			{
				this.driver=driver1;
				PageFactory.initElements(driver1, this);
			}
			@FindBy (xpath="//input[@id='user_email']")
	         WebElement emailid;
			@FindBy (xpath="//input[@id='user_password']")
	         WebElement password;	
			@FindBy (xpath="//input[@name='commit']")
	         WebElement LoginButton;
			
			public WebElement Email() {
				return emailid;
			}public WebElement password() {
				return password;
			}public WebElement LoginButton() {
				return LoginButton;
			}
		}


