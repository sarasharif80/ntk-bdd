Feature: Dashboard page Feature

  Scenario Outline: Verifying the user acount name
    Given User is logged in on the dashboard page
    When User navigates to Job Titles
    And User clicks on the Add icon
    And User provides job title data "<JobTitle>", "<JobDescription>", "<Note>"
    And User clicks save button
    Then System displays successfuly message "<SuccessMessage>"

    Examples: 
      | JobTitle   | JobDescription      | Note        | SuccessMessage     |
      | Sara Sh    | database developer  | Mid Level   | Successfully Saved |
      | SDET Sara  | Automation Engineer | Experienced | Successfully Saved |
      
      
 