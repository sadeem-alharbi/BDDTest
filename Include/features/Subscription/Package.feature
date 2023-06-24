Feature: Validate Subscription Package
  As end-user, I want be able to validate subscription package

  Scenario: Validate Subscription Package for Saudi Arabia-EN
    Given user navigate to the website EN
    When the user is redirected to KSA EN page
    Then the subscription package for ksa should be correct

  Scenario: Validate Subscription Package for Baharin-EN
    Given user navigate to the website EN
    When the user is redirected to Baharin EN page
    Then the subscription package for bahrain should be correct

  Scenario: Validate Subscription Package for Kuwait-EN
    Given user navigate to the website EN
    When the user is redirected to kuwait EN page
    Then the subscription package for kuwait should be correct
