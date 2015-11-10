//////////////////////////////////////////////////////////////////////
//FileName: MacChromeTest
//Function: Write the class for the whole process testing function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////
package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import resources.*;


public class MacChromeTest {
	private final String DRIVER_PATH = "/drivers/chromedriver";
	private final String URL_HOMEPAGE = "http://www.walmart.com";
	private final String USERNAME = "yaning@syr.edu";
	private final String PASSWORD = "Syr1215#";
	
	private WebDriver driver;
	public  WebDriverWait wait;
	private SignInPage signinPage;
	private SearchPage searchPage;
	private SelectPage selectPage;
	private addtocart addtocartPage;
	private viewcart viewcartPage;
	private SignOutPage signoutPage;
	private RemoveElement removeelement;

	
	@BeforeTest
	public void init() throws Exception  {
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get(URL_HOMEPAGE);
		Thread.sleep(2000);
	
		signinPage = new SignInPage(driver, wait);
	    searchPage = new SearchPage(driver, wait);
	    selectPage = new SelectPage(driver, wait);
		addtocartPage = new addtocart(driver, wait);
	    viewcartPage = new viewcart(driver, wait);
	    signoutPage = new SignOutPage(driver);
		removeelement = new RemoveElement(driver, wait);
		}
	
	@Test
	public void Process1()
		throws InterruptedException {
		//write the whole process for valid the TV searching
		signinPage.signInHomePageClick();
		signinPage.signInInformation(USERNAME, PASSWORD);
		signinPage.signInButtonClick();
		searchPage.fillInSearch("tv");
		searchPage.searchButtonClick();
	    selectPage.selectitem_TV();
	    String itemID=selectPage.saveItemId();
	    addtocartPage.addToCartClick();
	    viewcartPage.viewCartClick();
	    viewcartPage.validateId(itemID);
	    viewcartPage.validateNum();
	    removeelement.RemoveClickForProcess1();
	    Thread.sleep(2000);
	    
	    //write the whole process for valid the dvd searching
	    searchPage.fillInSearch2("dvd");
		searchPage.searchButtonClick();
	    selectPage.selectitem_TV();
	    String itemID2=selectPage.saveItemId();
	    addtocartPage.addToCartClick();
	    viewcartPage.viewCartClick();
	    viewcartPage.validateId(itemID2);
	    viewcartPage.validateNum();
	    removeelement.RemoveClickForProcess1();
	    Thread.sleep(2000);
	   
	    //write the whole process for valid the socks searching
	    searchPage.fillInSearch2("socks");
		searchPage.searchButtonClick();
	    selectPage.selectitem_SOCKS();
	    String itemID3=selectPage.saveItemId();
	    addtocartPage.addToCartClick();
	    viewcartPage.viewCartClick();
	    viewcartPage.validateId(itemID3);
	    viewcartPage.validateNum();
	    removeelement.RemoveClickForProcess1();
	    Thread.sleep(2000);
	    
	    //write the whole process for valid the iphone searching
	    searchPage.fillInSearch2("iphone");
		searchPage.searchButtonClick();
	    selectPage.selectitem_IPHONE();
	    String itemID4=selectPage.saveItemId();
	    addtocartPage.addToCartClick();
	    viewcartPage.viewCartClick();
	    viewcartPage.validateId(itemID4);
	    viewcartPage.validateNum();
	    removeelement.RemoveClickForProcess1();
	    Thread.sleep(2000);
	    
	    //write the whole process for valid the toys searching
	    searchPage.fillInSearch2("toys");
		searchPage.searchButtonClick();
	    selectPage.selectitem_TOYS();
	    String itemID5=selectPage.saveItemId();
	    addtocartPage.addToCartClick();
	    viewcartPage.viewCartClick();
	    viewcartPage.validateId(itemID5);
	    viewcartPage.validateNum();
	    removeelement.RemoveClickForProcess1();
	    Thread.sleep(2000);
	    
	    //write the function for signing out
	    signoutPage.signOut();
	    Thread.sleep(2000);
	}
	

	@AfterTest
	public void exit() throws Exception {
		driver.quit();
	}
}