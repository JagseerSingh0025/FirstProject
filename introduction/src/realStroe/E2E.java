package realStroe;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class E2E extends Base {

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
		String one=a.findElementsById("com.androidsample.generalstore:id/productPrice").get(0).getText();
		String two=a.findElementsById("com.androidsample.generalstore:id/productPrice").get(1).getText();
		one=one.substring(1);//removing $ from string new string will start from index 1 and remove 0 index means first letter.
		two=two.substring(1);
		double val1=Double.parseDouble(one);//converting string into double because we have decimals
		double val2=Double.parseDouble(two);
		double sum=val1+val2;
		String three=a.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
		three=three.substring(1);
		double val3=Double.parseDouble(three);
		Assert.assertEquals(sum, val3);
		System.out.println(val3);
		
	}

}
