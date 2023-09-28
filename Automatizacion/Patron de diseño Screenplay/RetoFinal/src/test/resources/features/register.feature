Feature: Register
  i as services user, i need register in the web page

  Scenario: Successful registration
    Given that the user is on the user registration page
    When enter a common text in the email field
    Then The alert see

 Scenario Outline: Social Networks
    Given that the user is on the registration/login page wants to know if he/she can log in with another alternative
    When click on the different options, Facebook, Google and Apple
    Then a total of 3 windows will be opened
      | opciones | <opciones> |
   Examples:
     | opciones |
     | Facebook |
     | Google   |
     | Apple    |

