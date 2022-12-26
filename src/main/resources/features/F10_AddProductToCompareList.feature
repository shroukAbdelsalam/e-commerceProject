@smoke
Feature: F09_AddProductToCompareList | Add Product To Compare List
  Scenario:user could add different products to compare list
    Given Select random category
    When hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    And add item to CompareList
    Then The product has been added to your CompareList


