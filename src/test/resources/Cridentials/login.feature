Feature: cheack login functionalty

  Scenario: Login Should be done with valid credential
    Given user is open the browser
    And user enters URL
    When user enters username and password
    Then click on task
    Then click on logout
    Then user close browser
