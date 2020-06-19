package Practical.RealProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	static ExtentReports ext;
	static ExtentSparkReporter R;//we dfine these two variables so we can use these globally
	public static ExtentReports Repo() {
		String path= System.getProperty("user.dir")+"//Report//report.html";//2. here we provided path and name of file to be stored
		R=new ExtentSparkReporter(path);//1, create an object of ExtentSparkReporter class it accepts path to store file.
		R.config().setReportName("Real Time Project");//4. her we are providing report name which will be displayed in report.
		R.config().setDocumentTitle("Report");//5. we also set document name which will be displayed as title of page
		
		//After configuration of reporter we have to attach reporter with working object
		ext=new ExtentReports();//6. create an object for ExtentReports class.
		ext.attachReporter(R);// 7.here we attached our reporter with reports object, basically we are provide configuration to our report
		ext.setSystemInfo("Tester Name-", "Jagseer Singh");//8. its optional, if you want to provide any other info to report
		return ext;
		
	}

}
