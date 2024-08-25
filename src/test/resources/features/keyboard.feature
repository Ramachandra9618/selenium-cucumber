Feature:
  Scenario Outline: search bar
    Given the user launches the Chrome browser
    And the user opens the Flipkart website "https://www.flipkart.com/"
   When the user click on the search bar
   And search the product in the search by keyboard "<string>"
    And press the enter button
    Then verify the search results  "<string>"
    And the user closes the website

    Examples:
      |string|
      | shirts  |
      |pant     |
      |mobile   |


  Scenario Outline: : End to End
    Given the user launches the Chrome browser
    And the user opens the Flipkart website "https://www.flipkart.com/"
    When the user click on the search bar
    And search the product in the search by keyboard '<string>'
    And press the enter button
    And  user click on the realme p1 Pro 5g
    And the use click on the AddCart
    Then verify the page
    And the user closes the website

    Examples:
      |string|
      | "realme P1 Pro 5G"|



    Scenario: select
      Given the user launches the Chrome browser
      And the user opens the Flipkart website "https://www.flipkart.com/"
      When the user mouse on the Fashion
      And the use select the  kids
      And in the select the in order girlsDresses
      And the user select the dress
      And the use click on the AddCart
      Then verify the page
      And the user closes the website



      Scenario: remove items from the cart
        Given the user launches the Chrome browser
        And the user opens the Flipkart website "https://www.flipkart.com/"
        Given the user launches the Chrome browser
        And the user opens the Flipkart website "https://www.flipkart.com/"
        When the user mouse on the Fashion
        And the use select the  kids
        And in the select the in order girlsDresses
        And the user select the dress
        And the use click on the AddCart
        And user remove the all the items in the cart
        Then verify the cart page
        And the user closes the website

