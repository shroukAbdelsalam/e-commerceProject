@smoke
Feature: F07_FilterByTag | users Can Filter By tag
  Scenario:user could select different tags
    Given Select random category
    When hover and open sub-Category if found
    And select tag
    Then  Ensure Selected Tag Name is appear in top
