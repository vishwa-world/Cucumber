package Testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"}
		,glue ={"Stepdefns"}
		,dryRun = true
		,monochrome = true
        ,plugin = {"pretty", "html:target/Destination"}
		,tags = "@Invalid"
        // ,format = {"json:target/Destination/cucumber.json"}

		)

		
public class TestRunner {
}
