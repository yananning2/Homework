//////////////////////////////////////////////////////////////////////
//FileName: ViewCartPage
//Function: Write the class for the viewing cart function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////
package resources;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class viewcart {
	private final String VIEW_CART_BTN = "//*[@id='PACViewCartBtn']";
    private final String CART_ITEM_XPATH = "//*[@id='spa-layout']/div/div/div[1]/div/div[4]/div[2]/div";
    public WebDriverWait wait;
	private WebDriver driver;
		
	
	public viewcart(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//write the function for valid the item name 
	public void validateId(String itemID) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(CART_ITEM_XPATH)));		
		List<WebElement> cartItems = driver.findElements(By
				.xpath(CART_ITEM_XPATH));

		WebElement cartItemOne = cartItems.get(0);
		Assert.assertTrue(cartItemOne != null);

		
		boolean idToCart = false;
		String idInCart = null;
		try {
			driver.findElement(By.xpath("//*[@id='CartItemInfo']/span")).click();
			String itemIdStore = "/html/body/div[2]/section/section[4]/div/div[2]/div[1]/div[4]/div";
            
			wait.until(ExpectedConditions.visibilityOfElementLocated
										(By.xpath(itemIdStore)));
			 WebElement webElement=  driver.findElement(By.xpath(itemIdStore));
			idInCart = webElement.getText();
			if (idInCart != null) {
				idToCart = true;
			}
		} catch (Exception e) {
		}
		Assert.assertTrue(idToCart, 
				"Selected item not put in cart!");
		Assert.assertEquals(idInCart, itemID);
		System.out.println("You have valid ID");
	}
	
	//write the function for valid the item number
	public void validateNum() {
		driver.findElement(By.xpath("//*[@id='top']/div[3]/div/div/div/div/div[4]/div/div[2]/div/a/i")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(CART_ITEM_XPATH)));		
		List<WebElement> cartItems = driver.findElements(By
				.xpath(CART_ITEM_XPATH));
		Assert.assertTrue(cartItems != null && cartItems.size() == 1,
				"More than one items in cart!");
		System.out.println("You have valid number");
	}
	
	//write the function for clicking the view cart button
	public void viewCartClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(VIEW_CART_BTN)));
		WebElement viewCart = driver.findElement(By.xpath(VIEW_CART_BTN));
		if (viewCart != null) {
			viewCart.click();
			System.out.print("You have viewed the cart");
		}
	}	
}