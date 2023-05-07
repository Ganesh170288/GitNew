package testRunnerforBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/BackgroundDemo/BackgroundDemo.feature", glue = {"stepsforBackground"},
monochrome=true,
//tags = "@SmokeTest",
plugin = {"pretty","html:target/HTMLREPORTS/Report.html","json:target/JSONREPORTS/Report.json",
		"junit:target/JUNITREPORTS/Report.xml"}
)

public class TestRunnerForBackground {
	

}
