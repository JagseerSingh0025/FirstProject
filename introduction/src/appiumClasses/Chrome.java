package appiumClasses;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome {

	public static AndroidDriver<AndroidElement> Mymethod() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();// creating obj of DC class
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8MA1J0LPD");// Step 1- to open our emulator “jagseer”
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//Step2 need to tell that we need to access uiautomator2 elements of Android
dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);// calling appium server through port number 
		                                                                                                       //and provide all the capabilities with object dc
		return driver;

	}

}
//this is my base class i can use whatever functions methods of this class in any class by inherit this class."using "public class AnotheClass extends App"
