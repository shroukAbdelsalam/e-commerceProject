@smoke
Feature: F09_AddProductToWishList | Add Product To WishList
  Scenario:Logged user could add different products to Wishlist
    Given Select random category
    When hover and open sub-Category if found
    And open SelectedItem
    And Select Size
    And add item to wishlist
    Then The product has been added to your wishlist


