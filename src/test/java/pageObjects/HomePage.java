package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//WebElement home =driver.findElement(By.id("welcome"));
	@FindBy(id = "welcome")
	WebElement home;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkIdent() {
		String actualResult =home.getText();
		String expectedResult = "Welcome Paul";
		Assert.assertEquals(expectedResult,actualResult);
	}
}
