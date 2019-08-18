@userStory
Feature: Verify the correct writing of the word "pruebas".
          As a user of the google page.
          I want to verify the correct writing of the word "pruebas".
          To comply with a correct search for results.

  @successfulCase
  Scenario: The one where the user verify the correct writing of the word "pruebas".

    Given the user enters the google page
    When diligence the word pruebaz in google search
    Then verify that the correct word pruebas is loaded in the browser
    And click on the correct word pruebas
    And verify that the results obtained are greater than six
