@smoke
Feature: F06_FilterByColor | users Can Filter By Color
  Scenario:user could filter with color
    Given Select any random category
    When hover and open sub-Category if Exist
    And Change the color filter
    #attribute-option-15
    Then Ensure of ckecked color