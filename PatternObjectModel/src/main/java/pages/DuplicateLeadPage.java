package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods 
{
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	public DuplicateLeadPage verifyPageTitle(String expectedTitle)
	{
		verifyTitle(expectedTitle);
		
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement clickCreateLeadBtn;
	public ViewLeadPage clickCreateLeadBtn()
	{
	click(clickCreateLeadBtn);
	return new ViewLeadPage(driver,test);
	}
	
}
