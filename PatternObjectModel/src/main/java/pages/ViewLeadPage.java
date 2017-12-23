package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods 
{
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	public ViewLeadPage verifyFirstName(String expectedFName)
	{
		System.out.println(expectedFName);
		System.out.println(eleFirstName);
		verifyExactText(eleFirstName, expectedFName);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement clickEditBtn;
	public EditLeadPage clickEditbtn()
	{
		click(clickEditBtn);
		return new EditLeadPage(driver, test);
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement verifyCompanyName;
	public ViewLeadPage verifyCompanyName(String updatedCompanyName)
	{
		verifyPartialText(verifyCompanyName,updatedCompanyName);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement clickDuplicateLeadBtn;
	public DuplicateLeadPage clickDuplicateLeadBtn()
	{
		click(clickDuplicateLeadBtn);
		return new DuplicateLeadPage(driver, test);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyDuplicatedName;
	public ViewLeadPage verifyDuplicatedName(String duplicatedName)
	{
		verifyExactText(verifyDuplicatedName, duplicatedName);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement clickFindLeads;
	public FindLeadsPage clickFindLeads()
	{
		click(clickFindLeads);
		return new FindLeadsPage(driver, test);
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement enterLeadId;
	public ViewLeadPage enterLeadId(String fromLeadID)
	{
		type(enterLeadId, fromLeadID);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div [@class='x-paging-info']")
	private WebElement verifyErrorMsg;
	public ViewLeadPage verifyErrorMsg(String errorMsg)
	{
		verifyExactText(verifyErrorMsg, errorMsg);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement clickDeleteBtn;
	public MyLeadsPage clickDeleteBtn()
	{
		click(clickDeleteBtn);
		return new MyLeadsPage(driver,test);
	}
}
