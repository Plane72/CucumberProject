package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.WebDriver;

public class FindaFlightPage2 {
    WebDriver driver;
    public FindaFlightPage2(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().contains("Select a Flight: Mercury Tours")){
            throw new WrongPageException("Can not reach page 2 of find a flight");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
