package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsWindowPage extends ProjectMethods{
	// Creating a constructor
	// Passing the driver and report test
	public FindLeadsWindowPage(RemoteWebDriver driver,ExtentTest test) {
		// to initialize the driver available for this whole class
		this.driver = driver;
		this.test = test;
		// Initialize page factory and pass the driver		
		PageFactory.initElements(driver, this);		
	
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement enterLeadId;
	public FindLeadsWindowPage enterLeadId(String fromLeadId)
	{
		type(enterLeadId, fromLeadId);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="x-btn-center")
	private WebElement clickFindLeadsBtn;
	public FindLeadsWindowPage clickFindLeadsBtn()
	{
		click(clickFindLeadsBtn);
		return this;
	}
	@FindBy(how=How.XPATH,using="x-grid3-cell-inner x-grid3-col-partyId")
	private WebElement clickFirstResultingLead;
	public MergeLeadsPage clickFirstResultingLead()
	{
		click(clickFirstResultingLead);
		switchToWindow(1);
		return new MergeLeadsPage(driver, test);
	}
	


	
}
