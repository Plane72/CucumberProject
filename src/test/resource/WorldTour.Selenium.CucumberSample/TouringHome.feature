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
    |KK|Wick|11 empire|Canada|KWICK|123456|
    |HH|Wrok|12 queens|UNITED STATES|HWROK|23467|