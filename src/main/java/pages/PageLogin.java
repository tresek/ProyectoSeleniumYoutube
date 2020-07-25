package pages;

import helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
	private WebDriver driver;
	private By userField;
	private By passwordField;
	private By loginButton;
	
	//constructor
	public PageLogin(WebDriver driver){
		this.driver = driver;
		userField = By.name("userName");
		passwordField = By.name("password");
		loginButton = By.name("login");
		
	}
	
	public void login(String user, String pass){
		driver.findElement(userField).sendKeys("user");
		driver.findElement(passwordField).sendKeys("user");
		driver.findElement(loginButton).click();
		Helpers helpers = new Helpers();
		helpers.contador(4);
	}
	

}

