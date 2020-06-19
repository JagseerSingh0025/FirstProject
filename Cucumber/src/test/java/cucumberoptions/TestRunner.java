package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features="src/test/java/feat",glue="definition"		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
