package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.WebDriver;

public class SupportPage {
    WebDriver driver;
    public SupportPage(WebDriver driver){
        this.driver = driver;
        if (!(driver.getTitle().contains("Under Construction: Mercury Tours"))){
            throw new WrongPageException("Incorrect support page title: "+driver.getTitle());
        }
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
