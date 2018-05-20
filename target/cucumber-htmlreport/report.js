$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('WorldTour.Selenium.CucumberSample\FindaFlight.feature');
formatter.feature({
  "line": 1,
  "name": "Reggistration and its handling",
  "description": "",
  "id": "reggistration-and-its-handling",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "",
  "id": "reggistration-and-its-handling;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "in Find a Flight page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "fill in page one of Find a Flight with correct information, then click continue button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "application will move to the second page of Find a flight",
  "keyword": "Then "
});
formatter.match({
  "location": "FindaFlightSteps.in_Find_a_Flight_page()"
});
formatter.result({
  "duration": 4027597222,
  "status": "passed"
});
formatter.match({
  "location": "FindaFlightSteps.fill_in_page_one_of_Find_a_Flight_with_correct_information_then_click_continue_button()"
});
formatter.result({
  "duration": 1219099355,
  "status": "passed"
});
formatter.match({
  "location": "FindaFlightSteps.application_will_move_to_the_second_page_of_Find_a_flight()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
});