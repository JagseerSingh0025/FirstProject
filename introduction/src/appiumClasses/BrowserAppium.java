package appiumClasses;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserAppium extends Chrome {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> a	=Mymethod();
		a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		a.get("https://www.cricbuzz.com");
		a.findElementByXPath("//*[@id=\"video_txt_2\"]").click();
	}

}
