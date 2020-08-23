Feature: job Title Feature

Background: 
    Given User is logged in and in NTK Dashboard page

 
  Scenario Outline: Edit existing job title and description
    When User navigates to Job Titles
     And User clicks on the Edit icon
     And User provides job title data "<JobTitle>", "<JobDescription>", "<Note>"
     And User clicks save button
    Then System displays successfuly message "<SuccessMessage>"

    Examples: 
      | JobTitle   | JobDescription     | Note    | SuccessMessage       |
      | Dev57799   | database developer | note444 | Successfully Updated |