Feature: Flipkart End-to-End Testing

  Scenario Outline: Search for a product and add it to the cart
    Given the user launches the Chrome browser
    And the user opens the Flipkart website "https://www.flipkart.com/"
    When the user clicks on the search bar
    And search the product in the search by keyboard '<rowNum>'
    And the user presses the Enter key
    And the user clicks on the first product in the search results
    And the user adds the product to the cart
    Then the user verifies the cart page
    And the user closes the website


    Examples:
      | rowNum |
      | 0      |
      | 1      |
      | 2      |

#      | realme              |
#      | Samsung             |
#      | iPhone 13           |

  Scenario: Browse through product categories
    Given the user launches the Chrome browser
    And the user opens the Flipkart website "https://www.flipkart.com/"
    And the user navigates to the "Electronics" category
    And the user selects "MobileAccessory" from the Electronics category
    Then the user verifies that the Mobiles page is displayed
    And the user closes the website

