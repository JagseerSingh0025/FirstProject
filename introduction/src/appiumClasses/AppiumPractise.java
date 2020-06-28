package appiumClasses;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumPractise extends Appreal { 

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Mymethod();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByAndroidUIAutomator("text(\"3. Preference dependencies\")").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementsByXPath("(//android.widget.RelativeLayout)").get(1).click();
		driver.findElementById("android:id/edit").sendKeys("hello");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
	}

}
