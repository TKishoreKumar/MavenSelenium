package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	// Creating a constructor
	// Passing the driver and report test
	public MergeLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		// to initialize the driver available for this whole class
		this.driver = driver;
		this.test = test;
		// Initialize page factory and pass the driver		
		PageFactory.initElements(driver, this);		
	
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement clickFromLeadIcon;
	public FindLeadsWindowPage clickFromLeadIcon()
	{
		click(clickFromLeadIcon);
		switchToWindow(0);
		return new FindLeadsWindowPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement clickToLeadIcon;
	public FindLeadsWindowPage clickToLeadIcon()
	{
		click(clickToLeadIcon);
		switchToWindow(1);
		return new FindLeadsWindowPage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement clickMergeBtn;
	public MergeLeadsPage clickMergeBtn()
	{
		click(clickMergeBtn);
		return this;
	}
	public ViewLeadPage acceptInFrame()
	{
		acceptInFrame();
		return new ViewLeadPage(driver,test);
	}
	
}
