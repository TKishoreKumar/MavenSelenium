package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006_MergeLead";
		testCaseName = "Mergee Lead TC (Positive)";
		testDescription = "To Merge two created leads";
		category= "Sanity";
		authors	="Kishore";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editLeadTC(String userName, String passWord, String fromLeadId,String toLeadId,String expectedText) 
	{
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterUserName(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterLeadId(fromLeadId)
		.clickFindLeadsBtn()
		.clickFirstResultingLead()
		.clickToLeadIcon()
		.enterLeadId(toLeadId)
		.clickFindLeadsBtn()
		.clickFirstResultingLead()
		.clickMergeBtn()
		.acceptInFrame()
		.clickFindLeads()
		.enterLeadId(fromLeadId)
		.clickFindLeads()
		.verifyErrorMsg(expectedText);
}
}
