//////////////////////////////////////////////////////////////////////
//FileName: SignOutPage
//Function: Write the class for the sign out function.
//Author:   YananNing
//Reference:Introduction to Programming In Java
//////////////////////////////////////////////////////////////////////
package resources;
import org.openqa.selenium.WebDriver;


public class SignOutPage {
	private final String URL_LOGOUT = "https://www.walmart.com/account/logout";
	private WebDriver driver;
	
	public SignOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//write the function for signing out
	public void signOut() {
		driver.get(URL_LOGOUT);
		System.out.print("OUR TEST IS SUCCESSFUL");
	}	
}

