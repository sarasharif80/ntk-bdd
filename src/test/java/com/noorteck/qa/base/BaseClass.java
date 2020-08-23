package com.noorteck.qa.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.noorteck.qa.pages.DashboardPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.SalaryComponentPage;
import com.noorteck.qa.pages.UserPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ReadPropertyData;
 
public class BaseClass extends CommonUI {

//	@BeforeMethod    use @beforeMethod annotation if ur project using tesn NG
	public void setUp() {

		prop = ReadPropertyData.getProperties(configFilePath);
		openBrowser(prop.getProperty("browser"));
		navigate(prop.getProperty("url"));

		initializeClassObj();
	}

//	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
//Create static object of each webpage
	public void initializeClassObj() {
		loginObj = new LoginPage();
		dashboardObj = new DashboardPage();
		salCompObj = new SalaryComponentPage();
		jobTitlesObj = new JobTitlesPage();
		usersObj = new UserPage();

	}
}
