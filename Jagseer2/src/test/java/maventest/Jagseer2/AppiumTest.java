package maventest.Jagseer2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class AppiumTest {
	private static Logger log=LogManager.getLogger(AppiumTest.class.getName());
	@Test
	public void method5() {
		log.debug("Method invoked 5");
		//System.out.println("Method 5 invoke sucessfully from Appium");
	}
	@Test
	public void method6() {
		log.error("this is not working");
		//System.out.println("Method 6 invoke sucessfully from Appium");
	}
	@Test
	public void method9() {
		log.fatal("work it out");
		//System.out.println("Method 9 invoke sucessfully from Appium");
	}


}
