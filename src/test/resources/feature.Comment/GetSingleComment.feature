Feature: Get Single Comment

  @gorest
  Scenario:Scenario: Get single comment
    Given Get single comment
    When Send request to get single comment
    Then Should return 200 OK
    And Validate get single comment with json schema validator