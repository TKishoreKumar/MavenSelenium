package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	// Creating a constructor
	// Passing the driver and report test
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		// to initialize the driver available for this whole class
		this.driver = driver;
		this.test = test;
		// Initialize page factory and pass the driver		
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement clickCRMSFA;
	public MyHomePage clickCRMSFA()
	{
		click(clickCRMSFA);
		return new MyHomePage(driver, test);
	}
}