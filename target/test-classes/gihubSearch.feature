Feature: Github search functionality

  Scenario Outline: Visit the github page,Search and verify the About page
    Given Guest visit the github website
    When Guest search with "<searchInput>"
    Then Guest verify the "<verifyOutput>"
    And  Guest click on the github About page

    Examples:

      | searchInput        | verifyOutput            |
      | create-react-app | facebook/create-react-app |
