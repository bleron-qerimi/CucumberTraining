Feature: As a user i should be able to log in.

  @Test_SDETA-139 @login @member @correct
  Scenario Outline: Login providing correct credentials
    Given the user in on the home page
    And on the nav bar clicks the LogIn button
    Then the user should be displayed with a log in form
    And if the user provides correct credentials "<username>" and  "<password>"
    Then the user should be able to log in
    Examples: LogIn credentials
      | username | password |
      | johndoe | johndoe |


  @Test_SDETA-144
  Scenario: Try to login using wrong authentication credentials
    Given User provides incorrect credentials
    Then the user should not be able to log in.

  @Test_SDETA-160
  Scenario: Checking if user remains logged in after reloading page
    When the user that was logged in reloads the page
    Then the user should remain logged in

  @Test_SDETA-161
  Scenario: Check user session expiration by checking if they remain logged in
    Given users with unexpired sessions
    Then they should remain logged in.

  @Test_SDETA-162
  Scenario: Checking if login page is prompted after session expiry
    Given users that have expired sessions
    Then they should be prompted to the log in page.

  @Test_SDETA-163
  Scenario: Checking if error message appears after incorrect credentials
    When users that provide incorrect credentials
    Then an error message should be prompted.