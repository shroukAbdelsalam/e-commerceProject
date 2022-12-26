@smoke
Feature: F08_AddProductToCard | Add Product To Card
  Scenario:user could add different products to Shopping car
    Given Select random category
    When hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    #product_attribute_9
    And add selected item to card
    Then Added Messae is visible
    #The product has been added to your shopping cart
  #div[class="bar-notification success"]

