$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('WorldTour.Selenium.CucumberSample\TouringHome.feature');
formatter.feature({
  "line": 1,
  "name": "Main page of touring",
  "description": "to make sure main page is there and functions are accessable",
  "id": "main-page-of-touring",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "2 - login",
  "description": "",
  "id": "main-page-of-touring;2---login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@ignore"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "in Browser page \"http://newtours.demoaut.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I login with user ID \"Mercury\", and password \"mercury\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I will acess to successful login page with title \"Find a Flight: Mercury Tours:\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com/",
      "offset": 17
    }
  ],
  "location": "WorldTourMainPageSteps.inBrowserPage(String)"
});
formatter.result({
  "duration": 2105785512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury",
      "offset": 22
    },
    {
      "val": "mercury",
      "offset": 46
    }
  ],
  "location": "WorldTourMainPageSteps.iLoginWithUserIDAndPassword(String,String)"
});
formatter.result({
  "duration": 3412895145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Flight: Mercury Tours:",
      "offset": 50
    }
  ],
  "location": "WorldTourMainPageSteps.iWillAcessToSuccessfulLoginPageWithTitle(String)"
});
formatter.result({
  "duration": 15222535,
  "status": "passed"
});
});