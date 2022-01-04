package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/feature/facebook.feature",
		glue="step_defination",
		dryRun=true
		)

public class CukesRunners {

}
