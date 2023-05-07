package testRunnerTag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeaturesWithTags/Tags.feature",
glue= {"stepDefinations"},
//tags = ("@smoke or @regression"),

//tags = ("@smoke and @regression"),

//tags = ("(@smoke or @regression) and @important"),

//tags = ("@regression and not @smoke"),

//tags = ("(@smoke or @regression) and not @important"),

tags = ("@mustrun"),


monochrome = true,

plugin = {"pretty","html:target/HTMLREPORTS/Report.html","json:target/JSONREPORTS/Report.json",
"junit:target/JUNITREPORTS/Report.xml"}
		
		)

public class SingleTag {
	
	

}
