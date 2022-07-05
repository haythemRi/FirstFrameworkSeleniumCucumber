@SignIn_orange
Feature: Sign In orange website
  I want to sign in

  @Valid_sign_in
  Scenario: enter valid credentials
    Given I open orange application
    When I enter login 
    And I enter pwd
    And I click on login button
    Then  Home should be displayed

 
 @Invalid_sign_in
  Scenario Outline: enter invalid credentials
    Given I open orange application
    When I enter IL "<invalidlogin>" 
    And I enter  IP "<invalidpassword>"
    And I click on login button
    Then An error message displayed

    Examples: 
      |invalidlogin|invalidpassword| 
      |Admin1  |     5555 |
      |gfhfghf|     777  | 