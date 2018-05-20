package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public RegisterSuccessfulPage Register(String fName, String lName, String addRess, String counTry, String userName, String passWord){
        this.driver.findElement(By.name("firstName")).sendKeys(fName);
        this.driver.findElement(By.name("lastName")).sendKeys(lName);
        this.driver.findElement(By.name("address1")).sendKeys(addRess);
        this.driver.findElement(By.name("country")).sendKeys(counTry);
        this.driver.findElement(By.name("email")).sendKeys(userName);
        this.driver.findElement(By.name("password")).sendKeys(passWord);
        this.driver.findElement(By.name("confirmPassword")).sendKeys(passWord);
        this.driver.findElement(By.name("register")).click();
        return new RegisterSuccessfulPage(driver);
    }
}
