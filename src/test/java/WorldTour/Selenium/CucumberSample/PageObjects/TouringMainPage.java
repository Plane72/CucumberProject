package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TouringMainPage {
    private WebDriver driver;

    public TouringMainPage(WebDriver driver, String touringURL){
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get(touringURL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public FindaFlightPage loginUser(String userID, String userPWD){
        driver.findElement(By.name("userName")).sendKeys(userID);
        driver.findElement(By.name("password")).sendKeys(userPWD);
        driver.findElement(By.name("login")).click();
        return new FindaFlightPage(driver);
    }
    public RegisterPage goesToRegisterPage(){
        driver.findElement(By.linkText("REGISTER")).click();
        return new RegisterPage(driver);
    }
}
