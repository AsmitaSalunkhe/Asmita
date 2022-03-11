Feature: Test login with different set of input
  Scenario Outline: Test Login valid & invalid set of input 
    * user open chrome browser
    * navigates to newtours
    * enter username as"<username>"
    * enter password as"<password>"
    * user clicks On submit 
    * verify login success
    * close the browser

    Examples: 
      | username | password | 
      | mercury  |  mercury | 
      | mercury  | mercury  | 
      | m        |     M    |
      |Name      |mercury   |
