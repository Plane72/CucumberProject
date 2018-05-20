package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.WebDriver;

public class FindaFlightPage {
    WebDriver driver;
    public FindaFlightPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
