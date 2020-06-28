package introduction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeAppium extends App{

	public static void main(String[] args) throws MalformedURLException {	
	AndroidDriver<AndroidElement> a	=Mymethod();
	a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	a.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	a.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	a.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	a.findElementByXPath("//*[@content-desc='3']").click();
	AndroidElement first=a.findElementByXPath("//*[@content-desc='15']");
	AndroidElement second=a.findElementByXPath("//*[@content-desc='35']");
	TouchAction b=new TouchAction(a);
	b.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	System.out.println("Success");

	}

}
