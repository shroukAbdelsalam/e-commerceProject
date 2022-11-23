Feature: Logged User Actions
 

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
  Scenario:Logged user could add different products to Wishlist
  Scenario:user could add different products to compare list
  Scenario:Create successful Order


