package test;

import helpers.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PageLogin;
import pages.PageLogon;
import pages.PageReservation;

public class Prueba {
	private WebDriver driver;
	@BeforeMethod
	public void setup(){
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		Helpers helpers = new Helpers();
		helpers.contador(4);
		
	}
	@Test
	public void pruebaUno(){
		PageLogin pagelogin = new PageLogin(driver);
		pagelogin.login("user", "user");
		Helpers helpers = new Helpers();
		helpers.contador(4);
		PageLogon pagelogon = new PageLogon(driver);
		pagelogon.assertLogonPage();
	}
	@Test
	public void pruebaDos(){
		PageLogin pagelogin = new PageLogin(driver);
		pagelogin.login("mercury", "mercury");
		driver.findElement(By.name("login")).click();
		Helpers helpers = new Helpers();
		helpers.contador(4);
		PageReservation pagereservation = new PageReservation();
		pagereservation.assertPage();
		
			
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}
