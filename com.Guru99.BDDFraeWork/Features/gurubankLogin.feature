Feature: Guru bank smoke scenarios
	Scenario Outline: Login to GuruBank
	Given Gurubank LOgin page
	When title is GuruBank
	And user enetr usename and password
	And user clickis login button
	And user click on new customer link
	And user landed on add new customer page
	And user enters Customername as "<Customername>"	
	And address as "<Address>"	
	And city as "<City>"
	And state as "<State>"
	And pincode as "<Pin>"
	And mobno as "<MobileNumber>"
	And email as "<Email>"
	And password as "<Password>"
	And user clicks on Subit button
	Then verify success message
		
	Examples:
		| Customername |   Address    |   City     |  State      |   Pin   | MobileNumber |      Email           |  Password   |	
		|  tammineni   |   tammineni  |  tammineni |  tammineni  | 123456  |   645664777  |  tammineni@gmail.com |    tammi    |
		|    ravi      |   ravi       |  ravi      |  ravi       | 123456  |   968688868  |  ravi@gmail.com      |    ravi     |
		|   prakash    |   prakash    |  ravi      | prakash     | 123456  |   235235553  |  prakash@gmail.com   |    prakash  |
		 