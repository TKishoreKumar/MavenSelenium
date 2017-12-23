package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007_DeleteLead";
		testCaseName = "Delete Lead TC (Positive)";
		testDescription = "To delete the created lead";
		category= "Sanity";
		authors	="Kishore";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void deleteLeadTC(String userName, String passWord, String phoneNumber,String expectedText) 
	{
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLeads()
		.clickPhoneBtn()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeads()
		.captureFirstResultingLeadId()
		.clickFirstResultingLead()
		.clickDeleteBtn()
		.clickFindLeads()
		.enterLeadId(firstResultingName)
		.clickFindLeads()
		.verifyErrorMsg(expectedText);
		
}
}
