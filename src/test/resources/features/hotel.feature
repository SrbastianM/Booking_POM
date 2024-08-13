Feature: Reserve a Hotel

  Background:
    Given the user navigate to url
    When  the user put the credentials
      | email                     | password     |
      | srodriguezdev.l@gmail.com | 123asdfAcx@s |
    Then the user can see the home page

#    Create a Declarative Scenario, this one is Imperative
  Scenario: Search hotel options
    Given the user is logged and see home page
    When the user select destination place
    And the user selects "Cartagena de Indias" as option to travel
    Then the user select the search button
    When the user see the search results
    And the user select 3 or more as property rating
    And the user drag to 800000 or more budget per night
    When the user select Price lowest first as option
    Then the user select the first option and save all the hotel information
