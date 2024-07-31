Feature: Login
  I as user I need to login for reserve an hotel

  Scenario: Login Successful
    Given the user navigate to url
    When  the user put the credentials
      | email                     | password     |
      | srodriguezdev.l@gmail.com | 123asdfAcx@s |
    Then the user can see the home page