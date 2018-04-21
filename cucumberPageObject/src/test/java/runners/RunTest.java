package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// To run only one Feature file, I can keep one like "@Search-Cars" tag rather than 2 tags in the below project

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
glue = {"steps"},
monochrome = true,
tags = {"@Search-Cars, @Used-Search-Cars"},
plugin = {"pretty","html:target/cucumber"})
public class RunTest {
}
