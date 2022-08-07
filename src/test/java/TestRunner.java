import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
// import io.cucumber.java.en.CucumberOptions;
// import io.cucumber.java.en.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"}
		,dryRun = true
		,monochrome = true
        ,plugin = {"pretty", "html:target/Destination"}
		,tags = "@valid"
        // ,format = {"json:target/Destination/cucumber.json"}

		)
public class TestRunner {
}
