Feature: Guru bank smoke scenarios
	Scenario: Login to GuruBank
	Given Gurubank LOgin page
	When title is GuruBank
	And user enetr usename and password
	And user clickis login button
	And user click on new customer link
	And user landed on add new customer page
	Then user creating new customers with the input data present at "C:\Work\eclipse-workspace\com.Guru99.BDDFraeWork\TestData\GuruBankCustomer_Details.xlsx"