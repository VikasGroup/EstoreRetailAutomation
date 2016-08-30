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
Scenario Outline: ES06
Given user can be change the language "<language>"
When user can be view page content  with corresponding language "<language>"
Examples:
|language|
|ar|
|en|



@Reg
Scenario: ES08.1
Given user can see no any country selected on the drop down when default loading page.

@Reg
Scenario: ES012
Given user click on the link
When should be displayed notification error message 
@Reg
Scenario Outline: ES08.2
Given user should be able to select any country in WP through the country drop down list "<wpcountry>"
Examples:
|wpcountry|
|AF|
|AL|
|DZ|

@Reg
Scenario Outline: ES08.3 & ES010
Given user select the available country through country drop down list. "<country>"
When user should not allow to click on Shop Now button.
And user should be able to click on Check referrer button
Then user should not direct any page form the existing page "<url>"
Examples:
|country|url|
|AU|https://portal.qnet.net/eStore4/verifyreferrer.aspx?language=en|

@Reg
Scenario Outline: ES09
Given user can not see any local plan countries in country drop down "<localcountry>"
Examples:
|localcountry|
|GL|

@Reg
Scenario Outline: ES013
Given user click on the available link which regarding entered product page
When should be direct to the product page on same window "<url>"
Examples:
|url|
|https://portal.qnet.net/eStore4/products.aspx?Category=5011000&type=#|

@Reg
Scenario Outline: ES014.1
Given user directs to the products page 
When user select the preferred language from dropdown "<lang>"
And products radio button is highlighted "<src>"
Examples:
|lang|src|
|ar|images/AR/navretAR_02.jpg|
|en|images/EN/navretEN_02.jpg|



@Reg
Scenario Outline: ES014.2
Given user can filter the products via dropdown "<category>"
Examples:
|category|
|Brand|
|DeliveryMode|
|Price|
|ProdName|

@Reg
Scenario: ES014.3
Given default selected category is Health and wellness
When add to cart buttons available

@Reg
Scenario Outline: ES016
Given user select the search option  "<option>"
When user enter a negative key word "<product>"
Then click on search button 
And Validate error message "<msg>"
Examples:
|option|product|msg|
|ProdName|xxxxxxx|No Search result found!|

@Reg
Scenario Outline: ES019-023
Given user select the search option as  Product name/brand"<type>"
When user enter a key word "<prodName>"
And click on searchbutton 
Then verify on product name "<prodName>"
And verify on image "<image>"
And verify on Retail price "<price>"
And verify on S&H fee "<sh>"
And verify on Avalability "<avalability>"
And user select preferred products 
Examples:
|type|prodName|image|price|sh|avalability|
|ProdName|HomePure Alkaline Stick|true|USD 85.00|USD 10.00|true|
|ProdName|REAL Water Lifestyle Super Combo|true|USD 1,360.00|USD 67.00|true|

@Reg
Scenario: ES024
Given user can click on add to cart button



@Reg
Scenario Outline: ES028&27
Given user clicks on delete product button "<item>" 
When user clicks on empty cart button
Then directs to the  products page 
Examples:
|item|
|1|



@Reg
Scenario Outline: ES019-023
Given user select the search option as  Product name/brand"<type>"
When user enter a key word "<prodName>"
And click on searchbutton 
Then verify on product name "<prodName>"
And verify on image "<image>"
And verify on Retail price "<price>"
And verify on S&H fee "<sh>"
And verify on Avalability "<avalability>"
And user select preferred products 
Examples:
|type|prodName|image|price|sh|avalability|
|ProdName|HomePure Alkaline Stick|true|USD 85.00|USD 10.00|true|

@Reg
Scenario: ES024
Given user can click on add to cart button

@Reg
Scenario: ES024
Given User click on Add products button

@Reg
Scenario Outline: ES019-023
Given user select the search option as  Product name/brand"<type>"
When user enter a key word "<prodName>"
And click on searchbutton 
Then verify on product name "<prodName>"
And verify on image "<image>"
And verify on Retail price "<price>"
And verify on S&H fee "<sh>"
And verify on Avalability "<avalability>"
And user select preferred products 
Examples:
|type|prodName|image|price|sh|avalability|
|ProdName|REAL Water Lifestyle Super Combo|true|USD 1,360.00|USD 67.00|true|


@Reg
Scenario: ES024
Given user can click on add to cart button 

@Reg
Scenario Outline: ES025
Given user directs to the Shopping cart page
When shopping cart radio button is highlighted "<src>"
And enter the qty for each product "<item>" , "<qty>"
Then verify Price change "<item>" , "<price>" , "<qty>"
Examples:
|item|prodName|qty|price|src|
|1|HomePure Alkaline Stick|2|85|images/EN/navretEN_03.jpg|
|2|REAL Water Lifestyle Super Combo|2|1,360|images/EN/navretEN_03.jpg|

@Reg
Scenario: ES_029
Given user agree on T&Cs
When Click on T&C link
And user select USD as currency 
Then Click on Checkout botton

@Reg
Scenario Outline: ES_035
Given user should be able to see purchasing path of e store top corner of the page "<src>"
Examples:
|src|
|images/EN/navretEN_04.jpg|

@Reg
Scenario Outline: ES_036
Given user fill all the mandatory fields "<type>"
When user should be checked check boxes
Then enable confirm bottom
Examples:
|type|
|invalid|
|valid|

@Reg
Scenario Outline: ES_032
Given user directs to the checkout page "<url>"
When  checkout radio button is highlighted
And User verify the diliver details name 
And email
And address
And city
And zip
And counrty
And phone
Then user verify on countinue button
And cancel button
Examples:
|url|
|https://portal.qnet.net/eStore4/confirmorder.aspx|

@Reg
Scenario: ES_033
Given user verify the sub total
When user select the dilivery option
Then user verify the total amount to pay
And If user select Euro, veryfy the total euro amount
And user click on countinue button


@Reg
Scenario Outline: ES_047
Given user select the Ecard as payment gateway
When User enter invalid ecard No/ PIN No "<num>" , "<pin>"
And click on validate button 
Then validate the error message "<msg>"
Examples:
|num|pin|msg|
|56156|1111111|Card Status Error eCard No. : 56156|

@Reg
Scenario Outline: ES_046
Given User enter valid ecard No "<num>"
When  corresponding PIN No "<pin>"
Then click on validatebutton
And click on Confirm button 
Examples:
|num|pin|
|TEST0000000001|QECTST|