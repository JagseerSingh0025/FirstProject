package realStroe;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> basic() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();// creating obj of DC class
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Jagseer");// Step 1- to open our emulator “jagseer”
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//Step2 need to tell that we need to access uiautomator2 elements of Android
        dc.setCapability("appPackage", "com.androidsample.generalstore");
        dc.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);// calling appium server through port number 
		                                                                                                       //and provide all the capabilities with object dc
		return driver;
	}

}
///com.androidsample.generalstore.MainActivity
// com.androidsample.generalstore