Feature: Module 1 User Story 1

  Background: Environment set up module 1
    Given Module1 environment setup
    
  @m1u1 @all
  Scenario Outline: M1U1TC1 - Login with multiple users
    Given M1U1TC1 User navigates to home screen
    When M1U1TC1 User initiates login with following credentials "<Username>" and "<Password>"
    Then M1U1TC1 Login validation should be successful

    Examples: 
      | Username           | Password |
      | M1U1TC1_0@user.com | M1U1TC1  |
      | M1U1TC1_1@user.com | M1U1TC1  |

  @m1u1 @all
  Scenario: M1U1TC2 - Dummy test 2
    Given M1U1TC2 Dummy step

  @m1u1 @all
  Scenario: M1U1TC3 - Dummy test 3
    Given M1U1TC3 Dummy step
