package WorldTour.Selenium.CucumberSample.steps;

import WorldTour.Selenium.CucumberSample.PageObjects.*;
import WorldTour.Selenium.CucumberSample.ReusableFunctions.ScreenShotRule;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.*;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WorldTourMainPageSteps {
    WebDriver driver;
    TouringMainPage touringMainpage;
    FindaFlightPage findaFlightPage;
    RegisterPage registerPage;
    RegisterSuccessfulPage registerSuccessfulPage;
    SupportPage supportPage;

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
    @Rule
    public ScreenShotRule screenShootRule = new ScreenShotRule(driver);

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
        findaFlightPage = touringMainpage.loginUser(arg0, arg1);

    }

    @Then("^I will access to successful login page with title \"([^\"]*)\"$")
    public void iWillAcessToSuccessfulLoginPageWithTitle(String arg0) throws Throwable {
        Assert.assertEquals(arg0, findaFlightPage.getDriver().getTitle());
    }

    @Given("^From MainPage \"([^\"]*)\" going to Register page$")
    public void fromMainPageGoingToRegisterPage(String arg0) throws Throwable {
        touringMainpage = new TouringMainPage(driver, arg0);
        registerPage = touringMainpage.goesToRegisterPage();
    }

    @When("^Register with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" information$")
    public void registerWithInformation(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        registerSuccessfulPage = registerPage.Register(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @Then("^Registeration successed with title of \"([^\"]*)\"$")
    public void registerationSuccessedWithTitleOf(String arg0) throws Throwable {
        Assert.assertEquals(arg0,registerSuccessfulPage.getDriver().getTitle());
    }

    @And("^go to SupportPage with title \"([^\"]*)\"$")
    public void goToSupportPageWithTitle(String arg0) throws Throwable {
        supportPage = touringMainpage.goesToSupportPage();
        Assert.assertEquals(arg0,supportPage.getDriver().getTitle());
    }

    @When("^click on \"([^\"]*)\" button$")
    public void clickOnButton(String arg0) throws Throwable {
        supportPage.getDriver().findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();

    }

    @Then("^will return to main page title \"([^\"]*)\"$")
    public void willReturnToMainPageTitle(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @But("^shouldn't see \"([^\"]*)\" button$")
    public void shouldnTSeeButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
