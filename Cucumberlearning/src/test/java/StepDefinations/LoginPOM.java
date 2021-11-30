package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	WebDriver driver;

	@FindBy(id="name")
	WebElement username;

	public WebElement getUsername()
	{
		return username;
	}

	@FindBy(id="password")
	WebElement password;

	public WebElement getPassword()
	{
		return password;
	}

	@FindBy(id="login")
	WebElement loginBtn;

	public WebElement getLoginBtn()
	{
		return loginBtn ;


	}
	@FindBy(id="pageProfile")
	WebElement pageProfile;

	public WebElement getpageProfile()
	{
		return pageProfile ;

	}
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}



}
