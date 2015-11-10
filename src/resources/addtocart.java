/////////////////////////////////////////////////////////////////////////////////////////////////////
//FileName: Add to cart
//Function: Write the class for the adding items into the cart and valid the name and number function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////////////////////////////////////
package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class addtocart {
	private final String ADD_TO_CART_BTN_XPATH = "//*[@id='WMItemAddToCartBtn']";
	public WebDriver driver;
	public WebDriverWait wait;
	
	public addtocart(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}	
	
	//function for clicking the add to cart button
	public void addToCartClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(ADD_TO_CART_BTN_XPATH)));
		WebElement addToCart = driver.findElement(By.xpath(ADD_TO_CART_BTN_XPATH));
		if(addToCart != null) {
			addToCart.click();
			System.out.println("You have added the item to cart");	
		}
	}
	
}