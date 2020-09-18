Feature: Search and place the order for vegetables
@SeleniumTest
Scenario: Search for item and validate result
Given User is on the greenkart landing page
When User searched for "Cucumber"
Then "Cucumber" results are displayed

@SmokeTest
Scenario Outline: Search for item and validate result
Given User is on the greenkart landing page
When User searched for <Vegetables>
And Added Items to cart
And User proceeded to checkout page for purchase
Then Verify selected <Vegetables> is displayed in checkout page
Examples:
| Vegetables |
| Brinjal    |
| Beetroot   |
