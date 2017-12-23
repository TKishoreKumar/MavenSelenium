package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	// Creating a constructor
	// Passing the driver and report test
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		// to initialize the driver available for this whole class
		this.driver = driver;
		this.test = test;
		// Initialize page factory and pass the driver		
		PageFactory.initElements(driver, this);		

	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement enterCompanyName;
	public CreateLeadPage enterCompanyName(String cName)
	{
		type(enterCompanyName, cName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement enterFirstName;
	public CreateLeadPage enterFirstName(String fName)
	{
		type(enterFirstName, fName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement enterLastName;
	public CreateLeadPage enterLastName(String lName)
	{
		type(enterLastName, lName);
		return this;
	}

	@FindBy(how=How.CLASS_NAME, using = "smallSubmit")	
	private WebElement clickCreateLeadBtn;
	public ViewLeadPage clickCreateLeadBtn ()
	{
		click(clickCreateLeadBtn);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement selectSourcedd;
	public CreateLeadPage  selectSourcedd(String sourceddValue)
	{
	selectDropDownUsingText(selectSourcedd, sourceddValue);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement selectMarketdd;
	public CreateLeadPage  selectMarketdd(String marketddValue)
	{
	selectDropDownUsingText(selectMarketdd, marketddValue);	
	return this;
	}
	@FindBy(how=How.NAME,using="firstNameLocal")
	private WebElement enterFirstNameLocal;
	public CreateLeadPage  enterFirstNameLocal(String fNameLocal)
	{
	type(enterFirstNameLocal, fNameLocal);	
	return this;
	}
	@FindBy(how=How.NAME,using="lastNameLocal")
	private WebElement enterLastNameLocal;
	public CreateLeadPage  enterLastNameLocal(String lNameLocal)
	{
	type(enterLastNameLocal, lNameLocal);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_personalTitle")
	private WebElement enterSalutation;
	public CreateLeadPage enterSalutation(String salutation)
	{
	type(enterSalutation, salutation);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement enterTitle;
	public CreateLeadPage enterTitle(String title)
	{
	type(enterTitle, title);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_annualRevenue")
	private WebElement enterAnnualIncome;
	public CreateLeadPage enterAnnualIncome(String annualIncome)
	{
	type(enterAnnualIncome, annualIncome);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement selectIndustry;
	public CreateLeadPage  selectIndustry(String industryValue)
	{
	selectDropDownUsingText(selectIndustry, industryValue);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement selectIndustryUsingIndex;
	public CreateLeadPage  selectIndustryUsingIndex(int industryValueIndex)
	{
	selectDropDownUsingIndex(selectIndustryUsingIndex, industryValueIndex);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement selectOwnerShip;
	public CreateLeadPage  selectOwnerShip(String ownershipValue)
	{
	selectDropDownUsingText(selectOwnerShip, ownershipValue);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_sicCode")
	private WebElement enterSICCode;
	public CreateLeadPage enterSICCode(String sicValue)
	{
	type(enterSICCode, sicValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_description")
	private WebElement enterDescription;
	public CreateLeadPage enterDescription(String descValue)
	{
	type(enterDescription, descValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_importantNote")
	private WebElement enterImportantNote;
	public CreateLeadPage enterImportantNote(String impValue)
	{
	type(enterImportantNote, impValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneCountryCode")
	private WebElement enterCountryCode;
	public CreateLeadPage enterCountryCode(String countryCodeValue)
	{
	type(enterCountryCode, countryCodeValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAreaCode")
	private WebElement enterAreaCode;
	public CreateLeadPage enterAreaCode(String areaCodeValue)
	{
	type(enterAreaCode, areaCodeValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneExtension")
	private WebElement enterPhoneExten;
	public CreateLeadPage enterPhoneExten(String phoneExtenValue)
	{
	type(enterPhoneExten, phoneExtenValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	private WebElement enterDepartmentName;
	public CreateLeadPage enterDepartmentName(String departmentValue)
	{
	type(enterDepartmentName, departmentValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_numberEmployees")
	private WebElement enterNoofEmployees;
	public CreateLeadPage enterNoofEmployees(String noofEmployees)
	{
	type(enterNoofEmployees, noofEmployees);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement selectCurrency;
	public CreateLeadPage  selectCurrency(String currencyValue)
	{
	selectDropDownUsingText(selectCurrency, currencyValue);	
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_tickerSymbol")
	private WebElement enterTicker;
	public CreateLeadPage enterTicker(String tickerValue)
	{
	type(enterTicker, tickerValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAskForName")
	private WebElement enterPersonToAsk;
	public CreateLeadPage enterPersonToAsk(String personToAsk)
	{
	type(enterPersonToAsk, personToAsk);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryWebUrl")
	private WebElement enterWebURL;
	public CreateLeadPage enterWebURL(String webURL)
	{
	type(enterWebURL, webURL);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalToName")
	private WebElement enterToName;
	public CreateLeadPage toName(String toNameValue)
	{
	type(enterToName, toNameValue);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalAddress1")
	private WebElement enterGeneralAddress1;
	public CreateLeadPage enterGeneralAddress1(String addressOne)
	{
	type(enterGeneralAddress1, addressOne);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalAddress2")
	private WebElement enterGeneralAddress2;
	public CreateLeadPage enterGeneralAddress2(String addressTwo)
	{
	type(enterGeneralAddress2, addressTwo);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalCity")
	private WebElement enterCity;
	public CreateLeadPage enterCity(String cityName)
	{
	type(enterCity, cityName);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement selectState;
	public CreateLeadPage selectState(String stateName)
	{
	selectDropDownUsingText(selectState, stateName);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalCountryGeoId")
	private WebElement selectCountry;
	public CreateLeadPage selectCountry(String countryName)
	{
	selectDropDownUsingText(selectCountry, countryName);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCode")
	private WebElement enterPostalCode;
	public CreateLeadPage enterPostalCode(String postalCode)
	{
	type(enterPostalCode, postalCode);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCodeExt")
	private WebElement enterPostalCodeExt;
	public CreateLeadPage enterPostalCodeExt(String postalCodeExt)
	{
	type(enterPostalCodeExt, postalCodeExt);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement enterPhoneNumber;
	public CreateLeadPage enterPhoneNumber(String phoneNumber)
	{
	type(enterPhoneNumber, phoneNumber);
	return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement enterEmail;
	public CreateLeadPage enterEmail(String emailId)
	{
	type(enterEmail, emailId);
	return this;
	}
}
