Feature: Logged User Actions
  Background: Ensure user is logged
    Given user is success logged

  Scenario:user can search any product
    When type of search field
    And Click on search Button
    Then Categories id display

  Scenario:User could switch between currencies US-Euro
    And Search for any product
    When click on dropdownlist of currencies and select one
    Then price display of  product change to selected currencies
    #adidas Consortium Campus 80s

  Scenario:user could select different Categories
  When Select random category
    #Apparel
  And  hover and open sub-Category if found
    #Shoes
  Then Ensure top bar hold same choosen sub-category


  Scenario:user could filter with color
    When Select random category
    And hover and open sub-Category if found
    And Change the color filter
    #attribute-option-15
    Then Ensure of ckecked color

  Scenario:user could select different tags
    When Select random category
    And hover and open sub-Category if found
    And select tag
    Then  Ensure Selected Tag Name is appear in top

  Scenario:user could add different products to Shopping car
    When Select random category
    And hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    #product_attribute_9
    And add selected item to card
    Then Added Messae is visible
    #The product has been added to your shopping cart
  #div[class="bar-notification success"]
  Scenario:Logged user could add different products to Wishlist
    When Select random category
    And hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    And add item to wishlist
    Then The product has been added to your wishlist

  Scenario:user could add different products to compare list
    When Select random category
    And hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    And add item to CompareList
    Then The product has been added to your CompareList




