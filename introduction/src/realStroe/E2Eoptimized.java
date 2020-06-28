package realStroe;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class E2Eoptimized extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> a = basic();
		a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Product = "Jordan 6 Rings";
		String Product2="Air Jordan 4 Retro";
		a.findElementById("android:id/text1").click();
		a.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));");
		// a.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "India" + "\").instance(0))"));// only if// upper method doesnot work.
		a.findElementByXPath("//android.widget.TextView[@text='Afghanistan']").click();
		a.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
		a.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		a.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		int count = a.findElementsById("com.androidsample.generalstore:id/rvProductList").size();
		a.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));//here we are providing all products list by providing list id of all products and  we will find desired product by matching text and scroll.
		for (int i = 0; i <= count; i++) {
			String PN = a.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
			if (PN.equalsIgnoreCase(Product)) {
				a.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				String Selected = a.findElementsById("com.androidsample.generalstore:id/productName").get(i)
						.getText();
				System.out.println("Selected Product is  " + Selected);
				break;
			}
		}
		a.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Air Jordan 4 Retro\").instance(0))"));//here we are providing all products list by providing list id of all products and  we will find desired product by matching text and scroll.
		for (int i = 0; i <= count; i++) {
			String PN = a.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
			if (PN.equalsIgnoreCase(Product2)) {
				a.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				String Selected = a.findElementsById("com.androidsample.generalstore:id/productName").get(i)
						.getText();
				System.out.println("Selected Product is  " + Selected);
				break;
			}
		}
		a.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(1000);
		a.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$160.97\"));");
		int count1=a.findElementsById("com.androidsample.generalstore:id/productPrice").size();
		double sum=0;
		for(int j=0;j<count1;j++) {
		String one=a.findElementsById("com.androidsample.generalstore:id/productPrice").get(j).getText();
		double amount=getdata(one);
		sum=amount+sum;
		}
		String three=a.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
		three=three.substring(1);
		double val3=Double.parseDouble(three);
		Assert.assertEquals(sum, val3);
		System.out.println("Sum of products "+sum);
		System.out.println("Sum of products  expected  "+val3);
		a.findElementByClassName("android.widget.CheckBox").click();
		WebElement first =a.findElementById("com.androidsample.generalstore:id/termsButton");
		TouchAction b=new TouchAction(a);
		b.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(1000);
		a.findElementById("android:id/button1").click();
		a.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		
	}
	public static double getdata(String a) {
		a=a.substring(1);
		double b=Double.parseDouble(a);
		return b;
	}

}
