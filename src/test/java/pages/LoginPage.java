package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver ;
	
	//************************ Objects *******************************
	
	@FindBy(xpath = "//a[@title=\"Log in\"]")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver basedriver) {
		
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	// ***************** Methods **************************************
	
	public void Login(String UserNameVal, String PassVal) {

		// Step1. Click on the Login Link
		LoginLink.click();

		// Step2: Enter Username
		UserName.sendKeys(UserNameVal);

		// Step3: Enter Password
		Password.sendKeys(PassVal);

		// Step4 Click Remember Me checkbox
		Checkbox.click();

		// Step5: Click pn Login Button
		LoginBtn.click();
	}

}
