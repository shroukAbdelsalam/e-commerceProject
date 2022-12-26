@smoke
Feature: F03_currencies | users could change between currencies
Scenario:User could switch between currencies US-Euro
Given Search for any product
When click on dropdownlist of currencies and select one
Then price display of  product change to selected currencies
