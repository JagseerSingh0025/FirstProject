package Practical.RealProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver1)

	{
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	WebElement login;

	public LoginPage Login() {
		login.click();
		LoginPage l = new LoginPage(driver);
		return l;
	}

	@FindBy(xpath = "//h2[contains(text(),'Featured Courses')]")
	WebElement Feature;

	public WebElement Feature() {
		return Feature;
	}

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	WebElement Contact;

	public WebElement Contact() {
		return Contact;

	}
}
