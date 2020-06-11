package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/main/java/features/TagingExample.feature", 
        glue = {"stepDefination"}, 
        dryRun = false, 
        monochrome = true, 
        strict = true,   
        //tags = {"@RegressionTest"}, //execute the regression test case only
        //tags = {"@SmokeTest"}, //execute the smoke test case only
        //tags = {"@EndToEnds"}, //execute the EndTEnd test case only
        //tags = {"@RegressionTest , @SmokeTest"}, // OR condition
        tags = {"@RegressionTest","@SmokeTest"}, // AND condition
        //tags = {"~@RegressionTest","~@SmokeTest"}, //ignore test case
        format = { 
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TagingExampleRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
	
	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
	
	@DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
