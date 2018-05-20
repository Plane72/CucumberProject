package WorldTour.Selenium.CucumberSample.ReusableFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class InputOutputDataHandler {

    public static ArrayList splitFlightInfoIntoArrayList(String inputSting){
        String[] splitArray = inputSting.split(",");
        ArrayList<String> itemList = new ArrayList<String>(Arrays.asList(splitArray));
        return itemList;
    }
}
