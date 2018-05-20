package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.WebDriver;

public class RegisterSuccessfulPage {
    WebDriver driver;
    public RegisterSuccessfulPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
