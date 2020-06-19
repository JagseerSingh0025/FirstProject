package maventest.Jagseer2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class sleniumTest {
	ExtentReports r;
	ExtentTest t;
	@BeforeTest
	public void rep() {
		String Path=System.getProperty("user.dir")+"//Reports/report.html";
	
		ExtentSparkReporter rep= new ExtentSparkReporter(Path);
		rep.config().setReportName("My Report");
		rep.config().setDocumentTitle("Test Report");
		r=new ExtentReports();
		r.attachReporter(rep);
	}
	@Test
	public void method() {
		t=r.createTest("method one");
		System.out.println("My first test with maven");
	}
	@Test
	public void method7() {
		System.out.println("Method 7 invoke sucessfully from nowhere");
		
	}
	@Test
	public void method1() {
		r.createTest("Test three");
		System.out.println("i am method 1");
		r.flush();
		
	}

}
