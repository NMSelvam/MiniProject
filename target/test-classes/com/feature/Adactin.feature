Feature: Checking The Hotel Booking Functionality In An Application
Scenario: Login Functionality
Given user Must Launch The URL
When user enter The userName In The userName Field
And user enter The Password In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Functionality 
When user enter The Location  In The Location Field
And user select The Hotels Names In The Hotels Field
Then user Click The Submit Button And It Navigates To The Hotels List Page

Scenario:Hotel Selection Functionality
When user select the Radio Button To Choose the Hotel List
Then user Click The Continue Button And It Navigates To The Payments Page

Scenario: Payments Functionality
When user enter the First Name In The First Name Field
When user enter the Last Name In The Last Name Field
When user enter the Address In The Address Field
When user enter the Credit Card Number In The Credit Card Number Field
When user enter the Credit Card Type In The Credit Card Type Field
When user enter the Credit Card Expire Month In The Credit Card Expire Month Field
When user enter the Credit Card Expire Year In The Credit Card Expire Year Field
And user enter the Credit Card CVV In The Credit Card CVV Field
Then user Click The Book Now Button And It Navigates To The Booking Confirmation Page 