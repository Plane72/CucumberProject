package WorldTour.Selenium.CucumberSample.steps;

import WorldTour.Selenium.CucumberSample.PageObjects.*;
import WorldTour.Selenium.CucumberSample.ReusableFunctions.InputOutputDataHandler;
import WorldTour.Selenium.CucumberSample.ReusableFunctions.ScreenShotRule;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindaFlightSteps {
    WebDriver driver;
    TouringMainPage touringMainpage;
    FindaFlightPage findaFlightPage;
    FindaFlightPage2 findaFlightPage2;
    RegisterPage registerPage;
    RegisterSuccessfulPage registerSuccessfulPage;
    SupportPage supportPage;

    String stringFindaFlight = "Roundtrip,1,Paris,April,20,New York,July,10,2,Blue Skies Airlines";

    @Before
    public void StartUpStep() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        touringMainpage = new TouringMainPage(driver, "http://newtours.demoaut.com");
    }

    @After
    public void TearDown() {
        driver.quit();
    }

    @Rule
    public ScreenShotRule screenShootRule = new ScreenShotRule(driver);

    @Given("^in Find a Flight page$")
    public void in_Find_a_Flight_page() throws Throwable {
        findaFlightPage = touringMainpage.loginUser("mercury","mercury");
    }

    @When("^fill in page one of Find a Flight with correct information, then click continue button$")
    public void fill_in_page_one_of_Find_a_Flight_with_correct_information_then_click_continue_button() throws Throwable {
        findaFlightPage2 = findaFlightPage.fillInFlightDetailsPage1(InputOutputDataHandler.splitFlightInfoIntoArrayList(stringFindaFlight));
    }

    @Then("^application will move to the second page of Find a flight$")
    public void application_will_move_to_the_second_page_of_Find_a_flight() throws Throwable {
        //
    }

}

