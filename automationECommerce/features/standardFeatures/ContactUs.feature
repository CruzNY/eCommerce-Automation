Feature: Contact Us
Scenario: Submit a Contact Us Message

Given User navigates to the my shop homepage
When User clicks on the "Contact Us" link
Then User verify that the "Contact Us" page is displayed
And User selects "Option" from the "Subject Heading" dropdown
And User enters "Email" into the "Email Address" textfield
And User enters "Order" into the "Order Reference" textfield
And User enters "Message" into the "Message" textarea
And User clicks on the "Submit" button
 
