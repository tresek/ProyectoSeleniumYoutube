package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageReservation {
	private WebDriver driver;
	private By titleText;
	public PageReservation(){
		this.driver = driver;
		titleText = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
	}
//metodo
public void assertPage(){
	Assert.assertTrue(driver.findElement(titleText).getText().contains("Use our Flight Finder to search"));
}	
}
