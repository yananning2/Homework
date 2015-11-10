INTRODUCTION
------------------------------------------------------------------------------------------------
This project automates an end-to-end user e-commerce transaction flow using any open source tool for www.walmart.com with an existing customer on Chrome.(I choose the number one testing problem)

REQUIREMENTS
------------------------------------------------------------------------------------------------
Scenarios to Automate
 * Login using existing account
 * Perform a search on home page from a pool of key words given below
 * Identify an item from the result set that you can add to cart
 * Add the item to cart    
 * Validate that item added is present in the cart and is the only item in the cart

Test Data
 * User name / password: yaning@syr.edu / Syr1215#
 * Search terms: TV, socks, DVD, toys, iPhone

INSTALLATION
------------------------------------------------------------------------------------------------
Environment Requirement
 * Mac
 * Java SE 8 runtime environment
 * Eclipse IDE(Version: Mars.1 Release (4.5.1))
 * WebDriver (Chrome driver file in "drivers" folder)
 * Selenium (Already included in bins file, no need to download).
 * TestNG Eclipse plug in(Install from http://testng.org/doc/download.html)
 
Project Import and Running
  * Open Eclipse -> Import -> Existing Projects Into Workspace
  *	Select Root Directory to the unzipped project folder, the project will show up in the  project
  * Click Finish and the project is imported to your workspace. 
  * Open test class MacChromeTest.java in com.homework.walmart package.
  * Run as TestNG
  
 PROJECT DESIGN
 -----------------------------------------------------------------------------------------------
 Design Assumptions
  * Search will be executed only when signed in.
  * The cart is empty when logged in.
  * Items are added as default style.
  * Cart will be cleared before log out.

Test Flow
 	1. Initial Chromedriver to open Chrome web server on Mac.
	2. Open www.walmart.com.
	3. Sign in using existing user name and password list in Requirements -> Test Data.
	4. Perform a search on home page from a pool of key words given.
	6: Add the selected item to cart.
	7. Validate that item added is present in the cart and is the only item in the cart by checking item id and cart item number.
	8. Delete item in cart to clear the cart.
	9. Do the process 4 to 8 repeat after all of the searching word has been tested
	9. Logout from the account.


POSSIBLE BUGS
-----------------------------------------------------------------------------------------------
 * Page may load incompletely when driver move on processing, thus test is interrupted.
 * If the design of the page changed, and the Xpath for the searched item has changed, test is interrupted.
	
TRADE-OFFS
-----------------------------------------------------------------------------------------------
  * Test only on Mac for Chrome browser.
  * Test only on the item which I directed. If we want to test randomly for the serached item. it can be interrupted.

Reasons for trade-offs 
  * Lack of time.
  
FUTURE IMPROVEMENTS
-----------------------------------------------------------------------------------------------
  * Automate more scenarios to make the automation more robust. 
  * Develop Chrome driver automation on Windows system and mobile automation.
  * Develop the function can randomly test the searched items and valid the items more detailed. 