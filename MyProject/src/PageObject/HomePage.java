package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver Driver1;
	public HomePage(WebDriver Driver2) {
		this.Driver1=Driver2;
		PageFactory.initElements(Driver2, this);
		}
	@FindBy(xpath="//div[@id='radio-btn-example']//label[2]//input[1]")
	WebElement Radio;

	@FindBy(xpath="//input[@id='autocomplete']")
	WebElement TextBox;
public WebElement Radio() {
	return Radio;
}
public WebElement TextBox() {
	return TextBox;
}
}
