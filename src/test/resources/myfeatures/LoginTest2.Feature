Feature: Update Profile
  As an employee of the company
  I want to be able to update my name, projects, email, and phone numbers on my profile
  In order to share my contact information with my colleagues

  #Background: 
    #Given I am on the "Company home" page on URL "www.mycomany.com"
    #When I am doing something
#
  #@tag1
  #Scenario: 
    #When you are doing something
    #When I click on the "Edit Personal Info" button

  Scenario Outline: 
    Given I am on the "<pageName>" page on URL "<url>"

    @tag1
    Examples: 
      | pageName | url |
      | aaa      | ccc |
      #| bbb      | ccc |

    @tag2
    Examples: 
      | pageName | url |
      | ddd      | fff |
      #| eee      | fff |
