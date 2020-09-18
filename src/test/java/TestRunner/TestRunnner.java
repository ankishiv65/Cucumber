package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/feature",
glue="StepDefinitions",tags="@SeleniumTest",monochrome=true,strict=true,
plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.html"}
		)
public class TestRunnner {


		
}
