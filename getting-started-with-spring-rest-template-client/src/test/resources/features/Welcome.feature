Feature: Understand Welcome Controller
  Scenario: Client calls GET request for default URL
  When the client calls default uri
  Then the client receives status code of 200
  And the client receives message Welcome User