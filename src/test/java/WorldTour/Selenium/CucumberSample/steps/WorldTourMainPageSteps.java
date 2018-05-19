package WorldTour.Selenium.CucumberSample.steps;

import WorldTour.Selenium.CucumberSample.PageObjects.LoginSuccessPage;
import WorldTour.Selenium.CucumberSample.PageObjects.TouringMainPage;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WorldTourMainPageSteps {
    WebDriver driver;
    TouringMainPage touringMainpage;
    TouringMainPage mainPage;
    LoginSuccessPage loggedinpage;
    @Before
    public void StartUpStep(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void TearDown(){
        driver.quit();
    }

    @When("^navigate to Touring main page by URL \"([^\"]*)\" and \"([^\"]*)\"$")
    public void navigate_to_Touring_main_page_by_URL(String arg1, String arg2) throws Throwable {
        touringMainpage = new TouringMainPage(driver, arg1);
    }

    @Then("^page tile \"([^\"]*)\" shows$")
    public void page_tile_shows(String arg1) throws Throwable {
        WebDriver touringDriver = touringMainpage.getDriver();
        Assert.assertEquals(arg1,touringDriver.getTitle());
    }


    @Given("^in Browser page \"([^\"]*)\"$")
    public void inBrowserPage(String arg0) throws Throwable {
        touringMainpage = new TouringMainPage(driver, arg0);
    }

    @When("^I login with user ID \"([^\"]*)\", and password \"([^\"]*)\"$")
    public void iLoginWithUserIDAndPassword(String arg0, String arg1) throws Throwable {
        loggedinpage = touringMainpage.loginUser(arg0, arg1);

    }

    @Then("^I will acess to successful login page with title \"([^\"]*)\"$")
    public void iWillAcessToSuccessfulLoginPageWithTitle(String arg0) throws Throwable {
        Assert.assertEquals(arg0,loggedinpage.getDriver().getTitle());
    }
}
