
Feature: Application acct
Scenario: Search experience for product in both home and offers page

Given User is on landing  page
When user searched with Shortname "<Name>" and extracted actual name of product
And added "3" items of the selected products to cart
Then user proceeds to Checkout and validate the "<Name>" items in checkout page


Examples:
| Name |
| Habib |  
| Prgathi |
| Anil |
