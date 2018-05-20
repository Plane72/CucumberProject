Feature: Main page of touring
  to make sure main page is there and functions are accessable
  @ignore
  Scenario: 1 - access Touring main page by URL
    Given
    When navigate to Touring main page by URL "http://newtours.demoaut.com/" and "/specialDeals/"
    Then page tile "Welcome: Mercury Tours" shows
  @ignore
  Scenario: 2 - login
    Given in Browser page "http://newtours.demoaut.com/"
    When I login with user ID "Mercury", and password "mercury"
    Then I will access to successful login page with title "Find a Flight: Mercury Tours:"
  Scenario Outline: : 3 - Register
    Given From MainPage "http://newtours.demoaut.com/" going to Register page
    When Register with "<Fname>" "<LName>" "<address>" "<Country>" "<username>" "<password>" information
    Then Registeration successed with title of "Register: Mercury Tours"
    Examples:
    |Fname|LName|address|Country|username|password|
    |Mic|W|11 donmills|Canada|MWU|123456|
    |He|W|12 northyork|UNITED STATES|Hen|23467|