package com.noorteck.qa.steps;



import com.noorteck.qa.base.BaseClass;

import io.cucumber.java.en.When;


public class SalaryComponantStepsDefinition extends BaseClass {
	

	@When("User navigates to Salary Componants")
	public void user_navigates_to_salary_componants() {
		salCompObj.clickAdminMenu();
		salCompObj.clickJobMenu();
		salCompObj.clickSalaryComponent();
		
		
		
	}

	@When("user enters the componant name {string}")
	public void user_enters_the_componant_name(String Qa) {
		salCompObj.enterComponentName(Qa);
		salCompObj.clickSave();
		salCompObj.isSuccessMessageDisp();
	   
	}
	@When("user click on edit icon")
	public void user_click_on_edit_icon() {
		salCompObj.clickEditButton();
	 
	}

	@When("user edit component name {string}")
	public void user_edit_component_name(String editName) {
		salCompObj.enterComponentName(editName);
		
	}
}
