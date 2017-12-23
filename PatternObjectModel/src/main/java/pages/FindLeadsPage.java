package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods 
{
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	@FindBy(how=How.XPATH, using= "//input[@name='id']/following::input")
	private WebElement enterFirstName;
	public FindLeadsPage enterFirstName(String FirstName)
	{
		type(enterFirstName, FirstName);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement clickFindLeads;
	public FindLeadsPage clickFindLeads()
	{
		click(clickFindLeads);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	private WebElement clickFirstResultingLead;
	public ViewLeadPage clickFirstResultingLead()
	{
		click(clickFirstResultingLead);
		return new ViewLeadPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement clickEmailBtn;
	public FindLeadsPage clickEmailBtn()
	{
		click(clickEmailBtn);
		return this;
	}
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement enterEmail;
	public FindLeadsPage enterEmail(String email)
	{
		type(enterEmail, email);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement clickFindLeadsbtn;
	public FindLeadsPage clickFindLeadsbtn()
	{
		click(clickFindLeadsbtn);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	private WebElement captureFirstResultingLeadName;
	public FindLeadsPage captureFirstResultingLeadName()
	{
		@SuppressWarnings("unused")
		String firstResultingName=getText(captureFirstResultingLeadName);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	private WebElement FirstResultingLead;
	public ViewLeadPage FirstResultingLead()
	{
		click(FirstResultingLead);
		return new ViewLeadPage(driver, test);
	}
	@FindBy(how=How.XPATH,using="(//em[@class='x-tab-left'])[2]")
	private WebElement clickPhoneBtn;
	public FindLeadsPage clickPhoneBtn()
	{
		click(clickPhoneBtn);
		return this;
	}
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement enterPhoneNumber;
	public FindLeadsPage enterPhoneNumber(String phoneNumber)
	{
		type(enterPhoneNumber, phoneNumber);
		return this;
	}
	@FindBy(how=How.ID,using="id")
	private WebElement enterLeadId;
	public FindLeadsPage enterLeadId(String LeadID)
	{
		type(enterLeadId, LeadID);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement verifyErrorMsg;
	public FindLeadsPage verifyErrorMsg(String expectedText)
	{
		verifyExactText(verifyErrorMsg, expectedText);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")
	private WebElement captureFirstResultingLeadId;
	public FindLeadsPage captureFirstResultingLeadId()
	{
		@SuppressWarnings("unused")
		String firstResultingName=getText(captureFirstResultingLeadId);
		return this;
	}
	

}
