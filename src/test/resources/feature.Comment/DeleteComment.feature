Feature: Delete Comment

  @gorest
  Scenario Outline: Delete comment with ID
    Given Delete comment using valid id <id>
    When Send delete comment request
    Then Status code should be 404 Not Found
    Examples:
      | ID |
      | 1  |

    @gorest
  Scenario Outline: Delete comment with invalid ID
    Given Delete comment using invalid id <id>
    When Send delete comment request
    Then Should return 404 not found
    Examples:
      | id |
      | 99999 |