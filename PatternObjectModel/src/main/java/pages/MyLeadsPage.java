package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	// Creating a constructor
	// Passing the driver and report test
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		// to initialize the driver available for this whole class
		this.driver = driver;
		this.test = test;
		// Initialize page factory and pass the driver		
		PageFactory.initElements(driver, this);		
	
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement clickFindLeads;
	public FindLeadsPage clickFindLeads()
	{
		click(clickFindLeads);
		return new FindLeadsPage(driver, test);
	}
	
}
