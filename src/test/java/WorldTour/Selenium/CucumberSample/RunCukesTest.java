package WorldTour.Selenium.CucumberSample;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**

 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
                features = {"src/test/resource"}/*,tags = {"~@ignore"}*/)


public class RunCukesTest {
}
