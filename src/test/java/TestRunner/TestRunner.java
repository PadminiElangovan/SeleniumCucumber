package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty",  "html:target/cucumber-reports/dsalgo.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=false,  //console output color
		tags="@Add2Product", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= "StepDefinitions") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
}
