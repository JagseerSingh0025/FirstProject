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

public class ValidationTitles extends Drivers {
	WebDriver driver;// Sometime when we run tests paralelley multiple classes using same drive, it
						// may be overridden by multiple classes at same time to avoid that we can
						// declare it once globlally
	public static Logger log = LogManager.getLogger(ValidationTitles.class.getName());

	@BeforeTest
	public void intiate() throws IOException {

		driver = intialize();
		String URL = url();
		driver.get(URL);
		log.info("Driver3 initialized");
	}

	@Test
	public void ValidateText() throws IOException {
		HomePage H = new HomePage(driver);
		String text = H.Feature().getText();
		Assert.assertEquals(text, "FEATURED COURSES");
		Boolean Condition = H.Contact.isDisplayed();
		Assert.assertTrue(Condition, "is not here");
		log.info("Success is not a piece of cake");

	}

	@AfterTest
	public void terminate() {
		driver.close();
	}
}
