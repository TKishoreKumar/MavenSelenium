package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_CreateLead";
		testCaseName = "Create Lead TC (Positive)";
		testDescription = "To Create a new lead with mandatory details only";
		category= "Sanity";
		authors	="Kishore";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData",invocationCount=3)
	public void createLead(String userName, String passWord, String cName,String fName,String lName,String sourceDD,String marketDD
			,String fNameLocal,String lNameLocal,String salutation,String title,String annualIncome,String currencyValue
			,String industryValue,String ownershipValue,String noofEmployees,String sicValue,String descValue
			,String impValue,String tickerValue,String countryCodeValue,String areaCodeValue,String phoneExtenValue
			,String phoneNumber,String emailId,String personToAsk,String webURL,String cityName,String stateName
			,String countryName) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSourcedd(sourceDD)
		.selectMarketdd(marketDD)
		.enterFirstNameLocal(fNameLocal)
		.enterLastNameLocal(lNameLocal)
		.enterSalutation(salutation)
		.enterTitle(title)
		.enterAnnualIncome(annualIncome)
		.selectCurrency(currencyValue)
		.selectIndustry(industryValue)
		//.selectIndustryUsingIndex(industryValueIndex)
		.selectOwnerShip(ownershipValue)
		.enterNoofEmployees(noofEmployees)
		.enterSICCode(sicValue)
		.enterDescription(descValue)
		.enterImportantNote(impValue)
		.enterTicker(tickerValue)
		.enterCountryCode(countryCodeValue)
		.enterAreaCode(areaCodeValue)
		.enterPhoneExten(phoneExtenValue)
		.enterPhoneNumber(phoneNumber)
		.enterEmail(emailId)
		.enterPersonToAsk(personToAsk)
		.enterWebURL(webURL)
		.enterCity(cityName)
		.selectState(stateName)
		.selectCountry(countryName)
		.clickCreateLeadBtn()
		.verifyFirstName(fName);
	}

}
