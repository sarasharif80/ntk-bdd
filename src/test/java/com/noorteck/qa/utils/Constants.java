package com.noorteck.qa.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.DashboardPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.SalaryComponentPage;
import com.noorteck.qa.pages.UserPage;

public class Constants {

	public static WebDriver driver;
	
	public static Properties prop;
	public static String configFilePath = "./src/test/resources/configs/configs.properties";
	
	//Create static object of each webPage	
	public static LoginPage loginObj;
	public static DashboardPage dashboardObj;
	public static SalaryComponentPage salCompObj;
	public static JobTitlesPage jobTitlesObj;
	public static UserPage usersObj;

}
