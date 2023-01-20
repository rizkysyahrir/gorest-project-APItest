Feature: GetListComment

  @gorest
  Scenario: Get List Comment with parameter
    Given Get List Comment with valid parameter
    When Send get list comment request
    Then should return be 200 OK
    And Validate get list comment json schema


  @gorest
  Scenario: Get List Comment with invalid parameter
    Given Get List Comment with invalid parameter
    When Send get list comment request
    Then Should return be 200 Ok

