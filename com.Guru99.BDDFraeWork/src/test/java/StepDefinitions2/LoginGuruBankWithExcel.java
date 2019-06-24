package StepDefinitions2;


import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import MasterTestData.MasterData;
import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginGuruBankWithExcel extends MasterData
{
	
	WebDriver driver;
	@Given("^Gurubank LOgin page$")
	public void gurubank_LOgin_page() throws Throwable {
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

	@When("^user enetr usename and password$")
	public void user_enetr_usename_and_password() throws Throwable {
		 driver.findElement(By.name("uid")).sendKeys("mngr203786");
		   driver.findElement(By.name("password")).sendKeys("regEtyr");
	}

	@When("^user clickis login button$")
	public void user_clickis_login_button() throws Throwable {
		 driver.findElement(By.name("btnLogin")).click();
	}

	@When("^user click on new customer link$")
	public void user_click_on_new_customer_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	}

	@When("^user landed on add new customer page$")
	public void user_landed_on_add_new_customer_page() throws Throwable {
		 String newCustPageTitle = driver.getTitle();
		   Assert.assertEquals("Guru99 Bank New Customer Entry Page", newCustPageTitle);
	}

	@Then("^user creating new customers with the input data present at \"(.*?)\"$")
	public void user_creating_new_customers_with_the_input_data_present_at(String excelpath) throws Throwable {
		List<Map<String, String>> outerList = MasterData.readAllData(excelpath);
		
		 
		for(Map<String,String> innermap : outerList)
		{
			
			for(String Key: innermap.keySet())
			{
							
				String keyValue = innermap.get(Key);	
				if (Key.equalsIgnoreCase("Customername"))
				{					
					driver.findElement(By.xpath("//input[@name='name']")).sendKeys(keyValue);	
					driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("0306" + Keys.ARROW_RIGHT + "1980");
				}
				
				if (Key.equalsIgnoreCase("Address"))
				{					
					driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("City"))
				{					
					driver.findElement(By.xpath("//input[@name='city']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("State"))
				{					
					driver.findElement(By.xpath("//input[@name='state']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("Pin"))
				{					
					driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("MobileNumber"))
				{					
					driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("Email"))
				{					
					driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(keyValue);
				}
				
				if (Key.equalsIgnoreCase("Password"))
				{					
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys(keyValue);
				}
			}
			driver.findElement(By.xpath("//input[@name='sub']")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		}
   }
}
