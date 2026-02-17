@Login-uni

Feature: Login univerty portal

  Background:
    Given I acess the login portal university

  Scenario: Login sucess validation
    When  I enter the correct Username
    And   I enter the correct password
    And   I click on login button
    Then  I should be presented with a  message


  Scenario: Unsucess Login validation
    **Given I acess the login portal university**
    When  I enter the incorret Username
    And   I enter the incorrect password
    And   I click on login button
    Then  I should be presented with a sucessful login message




  Scenario Outline: Validate - Successful & Unsuccessful Login
    When I enter a username <username>
    And I enter a password <password>>
    And I click on the login button
    Then I should be presented with the following validatin message <loginValidationText>

    Examples:
      | username  | password     | loginValidationText |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver1   | validation failed |
