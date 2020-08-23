Feature: Verify UserName Of Employee

  Background: 
    Given User is logged in and in NTK Dashboard page

  Scenario Outline: Verify Username of employee match with user table
    When User navigates to Users page
    Then User provides Employee Info Data "<EmployeeName>", "<UserName>"

    Examples: 
      | EmployeeName    | UserName        |
      | Aaliyah Haq     | aaliyah.haq     |
      | Alice Duval     | alice           |
      | Brody Alan      | brody           |
      | Cecil Bonaparte | cecil.bonaparte |
      | David Cole      | david.cole      |
      
      #Exercise 5 DataTables
        Scenario: Verify employee username
    When User navigates to Users page
    Then User verifies Employee Data 

    Examples: 
      | EmployeeName    | UserName        |
      | Aaliyah Haq     | aaliyah.haq     |
      | Alice Duval     | alice           |
      | Brody Alan      | brody           |
      | Cecil Bonaparte | cecil.bonaparte |
      | David Cole      | david.cole      |
      
      
      
      
