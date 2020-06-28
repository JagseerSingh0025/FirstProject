package testing;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class Actual extends App {
	@Test
	public void andro() throws MalformedURLException {
		String s=test1().getBatteryInfo().toString();
		System.out.println(s);
	}
	

}
