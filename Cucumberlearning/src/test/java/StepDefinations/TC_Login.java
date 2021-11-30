package StepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TC_Login {
	
		WebDriver driver;
		LoginPOM po;
	
	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "ExternalDownloads\\chromedriver.exe");					
	       driver= new ChromeDriver();
	       driver.manage().window().maximize();
	}

	@When("Launch the Application")
	public void launch_the_application() {
		
					
	       driver.get("https://example.testproject.io/web/");
	    
	}

	@And("^Enter the (.*) and (.*)$")
public void enter_the_username_and_password(String username, String password) throws InterruptedException {
		po=new LoginPOM(driver);
		po.getUsername().sendKeys(username);
		po.getPassword().sendKeys(password);
		Thread.sleep(2000);
	       
	    
	}
	@And("Click Login button")
	public void click_login_button() throws InterruptedException {
		po=new LoginPOM(driver);
		po.getLoginBtn().click();
		Thread.sleep(2000);
		
	}
	

	@Then("user should be naviaget to homepage")
	public void user_should_be_naviaget_to_homepage() throws InterruptedException {
		po=new LoginPOM(driver);
		if(po.getpageProfile().getText().contains("let's complete the test form:"))
		{
			System.out.println("PASS");
			driver.close();
		}
		else
		{
			System.out.println("FAIL");
			driver.close();
		}
		
	

	}
}
