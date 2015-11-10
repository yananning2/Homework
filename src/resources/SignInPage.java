//////////////////////////////////////////////////////////////////////
//FileName: SignInPage
//Function: Write the class for the sign in function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////

package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SignInPage {
    private static final String SIGN_IN_XPATH = "//a[@class='header-account-signin']";
	private static final String SIGN_IN_BUTTON_XPATH = "//button[@data-automation-id='login-sign-in']";
	private WebDriver driver;  
	public WebDriverWait wait;   
	
	public SignInPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	//write the function for clicking the sign in button
	public void signInHomePageClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(SIGN_IN_XPATH)));
		WebElement signIn = driver.findElement(By.xpath(SIGN_IN_XPATH));
		if (signIn != null) {
			signIn.click();
			
		}
	}
	
    //write the function for filling the sign in information
	public void signInInformation(String username, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));	
		WebElement usernameBar = driver.findElement(By.id("login-username"));	
		if (usernameBar != null) {
			usernameBar.clear();
			usernameBar.sendKeys(username);
			System.out.println("username has been entered");
		}
		WebElement passwordBar = driver.findElement(By.id("login-password"));
		if (passwordBar != null)
		{	
			passwordBar.clear();
			passwordBar.sendKeys(password);
		}
			
	}

    //write the function for clicking the sign in button
	public void signInButtonClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGN_IN_BUTTON_XPATH)));	
		WebElement signInBTN = driver.findElement(By.xpath(SIGN_IN_BUTTON_XPATH));
		if (signInBTN != null) {
			signInBTN.click();
			System.out.println("You have signin already");
		}	
	}
	
}