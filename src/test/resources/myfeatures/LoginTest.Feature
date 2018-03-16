Feature: Update Profile
  As an employee of the company
  I want to be able to update my name, projects, email, and phone numbers on my profile
  In order to share my contact information with my colleagues

#@tag1
  Scenario Outline: 
    Given I am on the "<pageName>" page on URL "<url>"

    #@tag1
    Examples: 
      | aaa | ccc |

    #@tag2
    Examples: 
      | pageName | url |
      | ddd      | fff |
