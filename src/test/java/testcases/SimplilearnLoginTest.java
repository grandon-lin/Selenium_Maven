package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

@Listeners(ListenerExample.class)

public class SimplilearnLoginTest extends BaseClass {
	
	@Test
	public void Test1() {
		
		test.log(LogStatus.INFO, "Test1 Started for testing.........................");
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		
		Assert.assertTrue(!Error.isDisplayed());
		
		//Or
//		Assert.assertEquals(ActError, ExpError);
		
	}
	
	@Test
	@Parameters({"uname", "pwd"})
	public void Test2(String userName, String password) {
		
		test.log(LogStatus.INFO, "Test2 Started for testing.........................");
		
		LoginPage lp = new LoginPage(driver);
		lp.Login(userName, password);
	}
	
	@Test
	public void Test3()
	{
		
		test.log(LogStatus.INFO, "Test3 Started for testing.........................");
		
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
				
		LoginPage lp = new LoginPage(driver);
		lp.Login(username, password);
	}

}
