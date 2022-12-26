@smoke
Feature: F05_HoverCategories | users could choose category
  Scenario:user could select different Categories
    Given Select random category
    #Apparel
    When  hover and open sub-Category if found
    #Shoes
    Then Ensure top bar hold same choosen sub-category