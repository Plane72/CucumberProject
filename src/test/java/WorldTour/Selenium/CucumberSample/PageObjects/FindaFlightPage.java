package WorldTour.Selenium.CucumberSample.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class FindaFlightPage {
    WebDriver driver;
    WebElement roundFlightType; WebElement oneWayFlightType;
    WebElement passengersNo;
    //WebElement departFrom;
    Select fromPortList;
    WebElement departMonth;
    WebElement departDay;
    WebElement arriveIn;
    WebElement returnMonth;
    WebElement returnDay;
    WebElement ecoServiceClass; WebElement busServiceClass;WebElement firstServiceClass;

    WebElement airLine;

    WebElement continueButton;

    public FindaFlightPage(WebDriver driver){
        this.driver = driver;
        if (!(driver.getTitle().contains("Find a Flight: Mercury Tours:"))){
            throw new WrongPageException("Incorrect Find a Flight page title: "+driver.getTitle());
        }
        roundFlightType = driver.findElement(By.cssSelector("[name='tripType'][value='roundtrip'][type='radio']"));
        oneWayFlightType = driver.findElement(By.cssSelector("[name='tripType'][value='oneway'][type='radio']"));
        passengersNo = driver.findElement(By.name("passCount"));
        fromPortList = new Select(driver.findElement(By.name("fromPort")));
        //departFrom = driver.findElement(By.name("fromPort"));
        departMonth = driver.findElement(By.name("fromMonth"));
        departDay = driver.findElement(By.name("fromDay"));
        arriveIn = driver.findElement(By.name("toPort"));
        returnMonth = driver.findElement(By.name("toMonth"));
        returnDay = driver.findElement(By.name("toDay"));
        ecoServiceClass = driver.findElement(By.cssSelector("[name='servClass'][value='Coach'][type='radio']"));
        busServiceClass = driver.findElement(By.cssSelector("[name='servClass'][value='Business'][type='radio']"));
        firstServiceClass = driver.findElement(By.cssSelector("[name='servClass'][value='First'][type='radio']"));
        airLine = driver.findElement(By.name("airline"));
        continueButton = driver.findElement(By.name("findFlights"));
    }

    public WebDriver getDriver(){
        return driver;
    }


    public FindaFlightPage2 fillInFlightDetailsPage1(ArrayList flightInfo){
        if (flightInfo.get(0).equals("Roundtrip")){
            roundFlightType.click();
        }else {
            oneWayFlightType.click();
        }
        passengersNo.sendKeys(flightInfo.get(1).toString());
        //departFrom.sendKeys(flightInfo.get(2).toString());
        fromPortList.selectByValue(flightInfo.get(2).toString());
        departMonth.sendKeys(flightInfo.get(3).toString());
        departDay.sendKeys(flightInfo.get(4).toString());
        arriveIn.sendKeys(flightInfo.get(5).toString());
        returnMonth.sendKeys(flightInfo.get(6).toString());
        returnDay.sendKeys(flightInfo.get(7).toString());
        if (flightInfo.get(8).equals("1")){
            ecoServiceClass.click();
        }else if (flightInfo.get(8).equals("2")){
            busServiceClass.click();
        }else if (flightInfo.get(8).equals("3")){
            firstServiceClass.click();
        }else{
            ecoServiceClass.click();
        }
        airLine.sendKeys(flightInfo.get(9).toString());

        continueButton.click();

        return new FindaFlightPage2(driver);
    }
}
