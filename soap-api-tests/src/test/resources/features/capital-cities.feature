@api @soap @country_info
Feature: Country Information Retrieval
  As a consuming application
  I want to query the Country Info SOAP web service
  So that I can reliably retrieve geographic data based on ISO codes

  @smoke @capital_city
  Scenario: Retrieve the capital city using a valid country code
    Given I have a valid SOAP request for the capital city
    And the country is Poland
    When I send the request to the service
    Then the response contains the right data for Poland