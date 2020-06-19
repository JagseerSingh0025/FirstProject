package introduction;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class App {

	public static AndroidDriver<AndroidElement> Mymethod() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		System.out.print(f.getAbsolutePath());
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Jagseer");
		dc.setCapability("appPackage", "com.example.android.apis");
		//dc.setCapability("appActivity", "com.example.android.apis.API Demos");*/

		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		return driver;

	}

}
//this is my base class i can use whatever functions methods of this class in any class by inherit this class."using "public class AnotheClass extends App"
