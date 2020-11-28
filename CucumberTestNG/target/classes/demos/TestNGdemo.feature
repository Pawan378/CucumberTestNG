Feature: Rate Exchange

Scenario: Verify response for latest foreign exchange rates

Given Customer has API for foreign exchange rates
When Customer hits the API
Then Status code obtained as 200