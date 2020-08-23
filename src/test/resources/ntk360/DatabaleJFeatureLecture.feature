Feature: Job Titles feature

Background:
Given User is logged in on the dashboard page

  Scenario: Adding new job to job tables
    When User navigates to Job Titles page
    And User clicks on the Add icon
    And User provides job title data
      | JobTitle | JobDescription            | Note |
      |SDET1ggg  | Business Analyst Engineer | BA   |
    And User clicks save button
    Then System displays successfuly message "<SuccessMessage>"
