$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('WorldTour.Selenium.CucumberSample\TouringHome.feature');
formatter.feature({
  "line": 1,
  "name": "Main page of touring",
  "description": "to make sure main page is there and functions are accessable",
  "id": "main-page-of-touring",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 19,
  "name": ": 3 - Register",
  "description": "",
  "id": "main-page-of-touring;:-3---register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "From MainPage \"http://newtours.demoaut.com/\" going to Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Register with \"Mic\" \"W\" \"11 donmills\" \"Canada\" \"MWU\" \"123456\" information",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Registeration successed with title of \"Register: Mercury Tours\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com/",
      "offset": 15
    }
  ],
  "location": "WorldTourMainPageSteps.fromMainPageGoingToRegisterPage(String)"
});
formatter.result({
  "duration": 2838297116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mic",
      "offset": 15
    },
    {
      "val": "W",
      "offset": 21
    },
    {
      "val": "11 donmills",
      "offset": 25
    },
    {
      "val": "Canada",
      "offset": 39
    },
    {
      "val": "MWU",
      "offset": 48
    },
    {
      "val": "123456",
      "offset": 54
    }
  ],
  "location": "WorldTourMainPageSteps.registerWithInformation(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1890807840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register: Mercury Tours",
      "offset": 39
    }
  ],
  "location": "WorldTourMainPageSteps.registerationSuccessedWithTitleOf(String)"
});
formatter.result({
  "duration": 25452536,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": ": 3 - Register",
  "description": "",
  "id": "main-page-of-touring;:-3---register;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "From MainPage \"http://newtours.demoaut.com/\" going to Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Register with \"He\" \"W\" \"12 northyork\" \"UNITED STATES\" \"Hen\" \"23467\" information",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Registeration successed with title of \"Register: Mercury Tours\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com/",
      "offset": 15
    }
  ],
  "location": "WorldTourMainPageSteps.fromMainPageGoingToRegisterPage(String)"
});
formatter.result({
  "duration": 2572550771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "He",
      "offset": 15
    },
    {
      "val": "W",
      "offset": 20
    },
    {
      "val": "12 northyork",
      "offset": 24
    },
    {
      "val": "UNITED STATES",
      "offset": 39
    },
    {
      "val": "Hen",
      "offset": 55
    },
    {
      "val": "23467",
      "offset": 61
    }
  ],
  "location": "WorldTourMainPageSteps.registerWithInformation(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1765221069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register: Mercury Tours",
      "offset": 39
    }
  ],
  "location": "WorldTourMainPageSteps.registerationSuccessedWithTitleOf(String)"
});
formatter.result({
  "duration": 18642802,
  "status": "passed"
});
});