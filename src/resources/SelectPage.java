//////////////////////////////////////////////////////////////////////
//FileName: SelectPage
//Function: Write the class for the select item function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////
package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SelectPage {
		private static final String ITEM_XPATH_TV ="//*[@id='tile-container']/div[1]/div/div/h4/a";
		private static final String ITEM_XPATH_SOCKS ="//*[@id='tile-container']/ul/li[1]/div/a[2]/h3/div";
		private static final String ITEM_XPATH_DVD="//*[@id='tile-container']/div[1]/div/div/h4/a" ;
		private static final String ITEM_XPATH_TOYS="//*[@id='sponsored-container-middle-2']/div/div[2]/ol/div/div/li[1]/div/div[2]/a";
		private static final String ITEM_XPATH_IPHONE="//*[@id='tile-container']/div[6]/div/div/h4";
	    private WebDriver driver;
	    public WebDriverWait wait;

	public SelectPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//write the function for selecting a TV item
	public void selectitem_TV() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ITEM_XPATH_TV)));
		driver.findElement(By.xpath(ITEM_XPATH_TV)).click();
		System.out.println("You have selected tv");
		
	}
	
	//write the function for selecting a socks item
	public void selectitem_SOCKS()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ITEM_XPATH_SOCKS)));
		driver.findElement(By.xpath(ITEM_XPATH_SOCKS)).click();
		System.out.println("You have selected socks");
	}
	
	//write the function for selecting a dvd item
	public void selectitem_DVD()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ITEM_XPATH_DVD)));
		driver.findElement(By.xpath(ITEM_XPATH_DVD)).click();
		System.out.println("You have selected dvd");
	}
	
	//write the function for selecting a toys item
	public void selectitem_TOYS()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ITEM_XPATH_TOYS)));
		driver.findElement(By.xpath(ITEM_XPATH_TOYS)).click();
		System.out.println("You have selected toys");
	}
	
	//write the function for selecting a iphone item
	public void selectitem_IPHONE()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ITEM_XPATH_IPHONE)));
		driver.findElement(By.xpath(ITEM_XPATH_IPHONE)).click();
		System.out.println("You have selected iphone");
	}
	
	//write the function to store the selected item name and use this name for validing after
	public String saveItemId() throws InterruptedException {
		String itemIdStore = "/html/body/div[2]/section/section[4]/div/div[2]/div[1]/div[4]/div";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemIdStore)));
		WebElement webElement=  driver.findElement(By.xpath(itemIdStore));
		Thread.sleep(1000);
		Assert.assertTrue(webElement != null);
        Boolean isItemIdPresent = false;
		String productIDAddToCart = null;
		try {
			 productIDAddToCart = webElement.getText();
			if (productIDAddToCart != null) {
				isItemIdPresent = true;
			}
		} catch (Exception e) {
		}
		Assert.assertTrue(isItemIdPresent,
				"No product Id stored!");
		System.out.println(productIDAddToCart);
		return productIDAddToCart;
	}
	
}