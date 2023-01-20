Feature: Post New Comments Test


  @gorest
  Scenario: Create new comments  without authorization
    Given Create new comment without authorization
    When send create request
    Then API should return response 401 Unauthorized
    And API should return body eror message "Authentication failed"

  @gorest
  Scenario: Create new comments  with authorization
    Given Create new comment with authorization
    When send create request
    Then API should return response 422 Unprocessable Entity
    And API should return body eror message "Authentication failed"

  @gorest
  Scenario: Create new comments without name
    Given Create new comment without name
    When send create request
    Then API should return response 422 Unprocessable Entity
    And API should return body eror message "name can't be blank,is invalid"

  @gorest
  Scenario: Create new comments without body
    Given Create new comment without body
    When send create request
    Then API should return response 422 Unprocessable Entity
    And API should return body eror message "name can't be blank,is invalid"

  @gorest
  Scenario: Create new comments with invalid name (input Spec. Char)
    Given Create new comments with invalid name (input Spec. Char)
    When send create request new comments
    Then API should return response 201 Created