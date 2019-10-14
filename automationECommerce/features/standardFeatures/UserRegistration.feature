Feature: User Registration
Scenario: New user successfully registers a new account
	Given User is on the Homepage
	When User clicks on the "Sign In" button
	And User verifies the "AUTHENTICATION" page is displayed
	And User enters "Email Address" into textbox
	Then User clicks on the "Create an account" button
	
	And User verifies the "CREATE AN ACCOUNT" page is displayed
	Then User selects the "Mr." against the "" checkbox
	And User enters "First Name" into the "First Name" textbox
	And User enters "Last Name" into the "Last Name" textbox
	And User enters "Email Address" into the "Email Address" textbox
	And User enters "Password" into the "Password" textbox
	And User selects "5" from the "Month" dropdown
	And User selects "5" from the "Day" dropdown
	And User selects "5" from the "Year" dropdown
	
	And User And User enters "First Name" into the "First Name" textbox
	And User enters "Last Name" into the "Last Name" textbox
	And User enters "523 Address" into the "Address" textbox
	And User enters "City" into the "City" textbox
	And User selects "NY" from the "State" dropdown
	And User enters "11220" into the "Zip Code" textbox
	And User selects "United States" from the "Country" dropdown
	And User enters "123-456-7890" into the "Mobile Phone" textbox
	And User enters "Home" into the "Address Alias" textbox
	Then User clicks on the "Register" button
