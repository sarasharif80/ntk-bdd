Feature: Component Page Feature

  Background: 
    Given User is logged in on the dashboard page
     When User navigates to Salary Componants

  #Scenario: Verify Add new Salary Component
  #And User clicks on the Add icon
  #And user enters the componant name "Sarayi"
  #And User clicks save button
  #Then System displays successfuly message "Successfully Saved"
  
  
  
           
  #Ex3
  Scenario: Edit existing salary in Salary Components page
    When user click on edit icon
     And user edit component name "Sara s"
     And User clicks save button
    Then System displays successfuly message "Successfully Updated"
    
    
