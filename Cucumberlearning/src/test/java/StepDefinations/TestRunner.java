package StepDefinations;


import org.junit.runner.RunWith;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="Features\\UserLogin.feature",
glue= {"StepDefinations"},
monochrome=true,
plugin= {"pretty","html:target/HTMLReports/HtmlReport.html"},tags="@Smoke"
//plugin={"pretty","json:target/JSONReports/JSONReports.json"}
//plugin={"pretty","junit:target/JUNITReports/JunitReports.xml"}
)
public class TestRunner {
	
	

}
