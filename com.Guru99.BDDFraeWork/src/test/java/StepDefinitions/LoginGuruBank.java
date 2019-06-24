package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginGuruBank 
{
	WebDriver driver;
	@Given("^Gurubank LOgin page$")
	public void gurubank_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");		
	}

	
	@When("^title is GuruBank$")
	public void title_is_GuruBank() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Login Page title " + title);
		Assert.assertEquals("Guru99 Bank Home Page", title);
	}

	@And("^user enetr usename and password$")
	public void user_enetr_usename_and_password() throws Throwable {
	   driver.findElement(By.name("uid")).sendKeys("mngr203786");
	   driver.findElement(By.name("password")).sendKeys("regEtyr");
	}

	@And("^user clickis login button$")
	public void user_clickis_login_button() throws Throwable {
		 driver.findElement(By.name("btnLogin")).click();
	}

		
	@And("^user click on new customer link$")
	public void user_click_on_new_customer_link() {
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	 
	}

	@And("^user landed on add new customer page$")
	public void user_landed_on_add_new_customer_page() {
		  //Guru99 Bank New Customer Entry Page
		   String newCustPageTitle = driver.getTitle();
		   Assert.assertEquals("Guru99 Bank New Customer Entry Page", newCustPageTitle);
	}

	@And("^user enters Customername as \"(.*?)\"$")
	public void user_enters_Customername_as(String Customername) {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Customername);	
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("0306" + Keys.ARROW_RIGHT + "1980");
	}

		

	@And("^address as \"(.*?)\"$")
	public void address_as(String Address) {
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
	   
	}

	@And("^city as \"(.*?)\"$")
	public void city_as(String City) {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
	   
	}

	@And("^state as \"(.*?)\"$")
	public void state_as(String State) {
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
	   
	}

	@And("^pincode as \"(.*?)\"$")
	public void pincode_as(String Pin) {
		
		
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(Pin);
	   
	}

	@And("^mobno as \"(.*?)\"$")
	public void mobno_as(String MobileNumber) {
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(MobileNumber);
	}

	@And("^email as \"(.*?)\"$")
	public void email_as(String  Email ) {
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(Email);
	   
	}

	@And("^password as \"(.*?)\"$")
	public void password_as(String  Password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	  
	}

	@And("^user clicks on Subit button$")
	public void user_clicks_on_Subit_button() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='sub']")).click();
	}

	@Then("^verify success message$")
	public void verify_success_message() throws Throwable {		
		
		String addcustsuccessmsg = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[1]/td/p")).getText();
		Assert.assertEquals("Customer Registered Successfully!!!", addcustsuccessmsg);
		//driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a")).click();
	   
	}
	
}


