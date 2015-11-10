//////////////////////////////////////////////////////////////////////////////
//FileName: RemoveElement
//Function: Write the class for the removing item from shopping cart function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
/////////////////////////////////////////////////////////////////////////////
package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveElement {
	private final String Remove_Botton_Click = "//*[@id='CartRemItemBtn']";
	public WebDriver driver;
	public WebDriverWait wait;
	
	public RemoveElement(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}	
	
	//write the function for clicking the remove button
	public void RemoveClickForProcess1() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(Remove_Botton_Click)));
		WebElement removebotton = driver.findElement(By.xpath(Remove_Botton_Click));
		if(removebotton != null) {
			removebotton.click();
			System.out.println("You have removed the item");	
		}
	}
	
}