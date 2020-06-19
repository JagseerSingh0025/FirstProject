package Practical.RealProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.assertions.Assertions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidationNav extends Drivers {
	WebDriver driver;
	public static Logger log=LogManager.getLogger(ValidationNav.class.getName());
	@BeforeTest
	public void intiate() throws IOException {
		driver = intialize();
		String URL = url();
		driver.get(URL);
		log.info("Driver2 initialized");

	}

	@Test
	public void ValidateNav() throws IOException {

		HomePage H = new HomePage(driver);
		Boolean Condition = H.Contact.isDisplayed();
		Assert.assertTrue(Condition, "is not here");
		log.info("Succeed");

	}

	@AfterTest
	public void terminate() {
		driver.close();
	}
}
