Feature: Main page of touring
  to make sure main page is there and functions are accessable

  Scenario: 1 - access Touring main page by URL
    Given
    When navigate to Touring main page by URL "http://newtours.demoaut.com/" and "/specialDeals/"
    Then page tile "Welcome: Mercury Tours" shows
  @ignore
  Scenario: 2 - login
    Given in Browser page "http://newtours.demoaut.com/"
    When I login with user ID "Mercury", and password "mercury"
    Then I will acess to successful login page with title "Find a Flight: Mercury Tours:"
