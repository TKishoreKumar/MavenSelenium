package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005_DuplicateLead";
		testCaseName = "Duplicate Lead TC (Positive)";
		testDescription = "To duplicated the created lead company name";
		category= "Sanity";
		authors	="Kishore";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editLeadTC(String userName, String passWord, String email,String expectedTitle,String duplicatedName) 
	{
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLeads()
		.clickEmailBtn()
		.enterEmail(email)
		.clickFindLeads()
		.captureFirstResultingLeadName()
		.clickFirstResultingLead()
		.clickDuplicateLeadBtn()
		.verifyPageTitle(expectedTitle)
		.clickCreateLeadBtn();
		//.verifyDuplicatedName(duplicatedName);
	}

}
