Feature: enrollment

@Reg
Scenario Outline: ES01

Given user  entered the URL on web browser "<url>"
When user can be view the Home page "<url>"
Then user should be able to see QNET logo and image on the home page
And  user should be able to see Search option top of the page
And user should be able to see language drop down top of the page
And user should be able to see IR login, Shop and Enroll links top corner of the page
And user should be able to see corresponding footer bottom of the page

Examples:
|url|
|http://www.qnet.net/|

@Reg
Scenario Outline: ES03
Given user click on the Shop button
When user should be able to see pop up message with Exit link
And user click on the Exit  link
Then user should be direct to the home page again "<url>"
Examples:
|url|
|http://www.qnet.net/|

@Reg
Scenario Outline: ES02
Given user click on the Shop button
When user should be able to see pop up message to continue to shop "<popup_url>"
And user click on the continue to shop link
Then user should be direct to the verify referrer detail page "<page_url>"
Examples:
|popup_url|page_url|
|http://www.qnet.net/|https://portal.qnet.net/eStore4/verifyreferrer.aspx?language=en|

@Reg
Scenario Outline: ES05
Given user should be able to see purchasing path of e store top corner of the page
When user already in verify referrer page
Then user should be able to see Verify referrer radio button is selected by default loading the page "<img>"
And user can see default page loading with the English on language drop down
Examples:
|img|
|images/EN/navretEN_01.jpg|

@Reg
Scenario Outline: ES05 
Given user can be change the language "<language>"
When user can be view page content  with corresponding language "<language>"
Examples:
|language|
|ar|
|en|
|es|
|fa|
|fr|
|id|
|pt|
|ru|
|zh|







