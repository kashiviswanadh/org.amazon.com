Feature: Amazon site Automation Testing

  Scenario Outline: 
    Given I want to open "<bn>" broswer
    When I want to Launch a site "https://www.amazon.in"
    Then do login using "<uid>" and "<pwd>" credentials
    Then Search for perticular product "nokia"
    And do logout

    Examples: 
      | bn      | uid           | pwd         |
      | chrome  | +919032042174 | 11KK1a0324@ |
      | firefox | +919032042174 | 11KK1a0324@ |
