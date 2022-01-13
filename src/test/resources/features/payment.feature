Feature:User make a payment to three different client

  Scenario:user make a payment to three different client and checked balance
    Given I login with username "company" and password "company"

  @hamza
  Scenario Outline: Make payments with three different clients
    Given Open browser and homepage screen
    When  Login with company username "company" and "company"
    And   Make "<phone>" with the values "<name>",<payments>,"<countries>"
    Then  Should see that log out page
    Examples:
      | countries | payments |  name   |  phone |
      |   Japan   |    10    |  ali    |  0533  |
      |   USA     |    20    |  veli   |  0534  |
      |   Canada  |    30    |  deli   |  0535  |