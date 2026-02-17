@Conta-Us
Feature: Webdriver University - Contact US Page

  Scenario: validate Sucessful Submission
    Given I acess the webdriver university contact us page
    When I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter a comment
    And  I click on submit button
    Then  I should be presented with a sucessful contact us submission message

  Scenario: validate Sucessful Submission - Specific Data
    Given  I acess the webdriver university contact us page
    When I enter a specific first name joe
    And  I enter a specific last name blogs
    And  I enter a specific email address joe_blogs@gmail.com
    And  I enter a specific comment "How are you?"
    And  I click on submit button
    Then I should be presented with a sucessful contact us submission message


  Scenario: validate Sucessful Submission - Specific Data
    Given  I acess the webdriver university contact us page
    When I enter a specific first name joe
    And  I enter a specific last name blogs
    And  I enter a specific email address joe_blogs@gmail.com
    And  I enter a specific comment "How are you?"
    And  I click on submit button
    Then I should be presented with a sucessful contact us submission message

