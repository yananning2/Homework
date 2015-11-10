//////////////////////////////////////////////////////////////////////
//FileName: SearchPage
//Function: Write the class for search item function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////
package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage {
	private static final String SEARCH_BOX = 
			"//input[@class='js-searchbar-input js-header-instant-placeholder searchbar-input tt-input']";
	private static final String SEARCH_BUTTON = 
		    "//button[@class='searchbar-submit js-searchbar-submit']";
	private final String CHECK_ORDER_BTN_XPATH ="/html/body/div[2]/section/section[4]/div/div/div/div/div[2]/div";

	public WebDriver driver;
	public WebDriverWait wait;
	
	public SearchPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	   }

	//write the function for filling the search bar for the first search item
	public void fillInSearch(String searchitem ) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
			.xpath(CHECK_ORDER_BTN_XPATH)));
		WebElement searchBar = driver.findElement(By.xpath(SEARCH_BOX));
		if (searchBar != null) {	
			searchBar.clear();
			searchBar.sendKeys(searchitem);
		}
		
}	
	//write the function for filling the search bar for the following search items
	public void fillInSearch2(String searchitem ) {
		WebElement searchBar = driver.findElement(By.xpath(SEARCH_BOX));
		searchBar.sendKeys(searchitem);
        }	
	
	//write the function for clicking the search button 
	public void searchButtonClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(SEARCH_BUTTON)));				
		WebElement searchButton = driver.findElement(By.xpath(SEARCH_BUTTON));
		searchButton.click();
		System.out.println("You have search the item");
		}	
}