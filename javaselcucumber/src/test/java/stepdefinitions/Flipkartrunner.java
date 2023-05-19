package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Flipkartlogin.feature",glue= {"stepdefinitions"},

monochrome=true,
   plugin={"pretty","html:target/report.html",
		   "json:target/report/Cucumber.json",
		   "junit:target/report/Cucumber.xml"}
)

public class Flipkartrunner 
{

}
