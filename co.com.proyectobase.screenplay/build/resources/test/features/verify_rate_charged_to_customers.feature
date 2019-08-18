@userStory
Feature: Verify rate charged to customers.
          As boss of sales of the travel agency DX Hotels.
          I want to validate that the total price charged to the customer is correct.
          To comply with the agency's regulations.

  @successfulCase
  Scenario Outline: The one where the boss validates the correct rate charging to the agency clients.

    Given the boss of sale wants to enter the web portal of the DX Hotels agency
    When diligence the hotel search data of your choice
      |Location  |CheckIn  |CheckOut  |Children  |
      |<Location>|<CheckIn>|<CheckOut>|<Children>|
    And validates wich is the location with the lowest fare
    Then validate that the total price charged to the customer for the total days is correct
      |TotalValue  |
      |<TotalValue>|

    Examples:
    |Location   |CheckIn |CheckOut |Children|TotalValue|
    |Los Angeles|8/8/2019|8/9/2019 |1       |218       |
    |New York   |8/8/2019|8/10/2019|1       |333       |
    |Rome       |8/8/2019|8/9/2019 |1       |258       |

  @alternateCase
  Scenario Outline: The one where the boss validates the correct rate charging to the agency clients.

    Given the boss of sale wants to enter the web portal of the DX Hotels agency
    When diligence the hotel search data of your choice
      |Location  |CheckIn  |CheckOut  |Children  |
      |<Location>|<CheckIn>|<CheckOut>|<Children>|
    Then validate that the system shows error message Value is out of range

    Examples:
      |Location   |CheckIn |CheckOut |Children|
      |Los Angeles|8/5/2019|8/6/2019 |1       |