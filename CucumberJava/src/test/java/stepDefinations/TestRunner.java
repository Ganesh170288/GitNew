package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/GoogleSearch.feature", glue = {"stepDefinations"},
monochrome=true,
//tags = "@SmokeTest",
plugin = {"pretty","html:target/HTMLREPORTS/Report.html","json:target/JSONREPORTS/Report.json",
		"junit:target/JUNITREPORTS/Report.xml"}
)

public class TestRunner {
	

}
