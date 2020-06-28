package testing;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class App {
	@Test
public AndroidDriver<AndroidElement> test1() throws MalformedURLException {
		File f = new File("src");
		File fs = new File(f, "chrome-83-0-4103-106.apk");
		String s= fs.getAbsolutePath();
		System.out.println(s);
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Jagseer");
	dc.setCapability("appPackage", "com.google.android.googlequicksearchbox");
	dc.setCapability("appActivity", "com.android.browser.BrowserActivity");
	//dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	return driver;
	
	
	
}
}

