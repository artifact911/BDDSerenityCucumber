Feature:
  Search Feature https://poisk-cheloveka.ru

  Scenario Outline: Positive test
    Given user opens the site
    And user clicks on input
    When user searches for <name>
    And user clicks on Search button
    Then user sees list of results
    And <name> should be displayed

    Examples:
      | name       |
      | Steve Jobs |
      | Bill Gates |