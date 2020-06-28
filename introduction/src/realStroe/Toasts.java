package realStroe;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Toasts extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> a	=basic();
		a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a.findElementById("android:id/text1").click();
		a.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"));");
		//a.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "India" + "\").instance(0))"));// only if upper method doesnot work.     
		a.findElementByXPath("//android.widget.TextView[@text='Canada']").click();
		//a.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
		a.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		a.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		String Message=a.findElementByXPath("//android.widget.Toast[1]").getAttribute("Name");//as per coding standards/android.widget.Toast class always belong to toast messages
	                                                                                          //message is always stored in name attribute.
		System.out.println(Message);
		Assert.assertEquals(Message, "Please enter your name");
	}
	

}
