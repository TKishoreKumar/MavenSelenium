package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_EditLead";
		testCaseName = "Edit Lead TC (Positive)";
		testDescription = "To edit the created lead company name";
		category= "Sanity";
		authors	="Kishore";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editLeadTC(String userName, String passWord, String FirstName,String CompanyUpdate) 
	{
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLeads()
		.enterFirstName(FirstName)
		.clickFindLeads()
		.clickFirstResultingLead()
		.clickEditbtn()
		.updateCompanyName(CompanyUpdate)
		.clickUpdateBtn()
		.verifyCompanyName(CompanyUpdate);
	}

}
