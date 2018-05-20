package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.WebDriver;

public class RegisterSuccessfulPage {
    WebDriver driver;
    public RegisterSuccessfulPage(WebDriver driver){
        this.driver = driver;
        if (!(driver.getTitle().contains("Register: Mercury Tours"))){
            throw new WrongPageException("Incorrect Register Success page title: "+driver.getTitle());
        }

    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
