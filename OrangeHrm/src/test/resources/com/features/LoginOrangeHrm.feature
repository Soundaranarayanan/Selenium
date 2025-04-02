Feature: Login Testing for OrangeHRM website
  I want to login in OrangeHRM and assert the quick Launch

  Background:
    Given The user is on the Login Page of OrangeHRM website
    When the user provides the valid username as "Admin" and password as "admin123"
    And the user clicks the login button
    Then the user is able to vivsible the Dashboard text
    
    
    @AssertQuickLaunch
    Scenario Outline: Asserting the Quich Launch Options
    Then assert the quick launch options "<option>"
    
    Examples:
    |option				|
    |Assign Leave	|
    |Leave List		|
    |Timesheets		|
    |Apply Leave	|
    |My Leave			|
    |My Timesheet	|