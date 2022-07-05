package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamplePage {
	WebDriver driver;
	@FindBy(id = "txtUsername")
	WebElement login;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement loginButton;

	public ExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public void enterLogin() {
		login.sendKeys("Admin");
	}

	public void enterPwd() {
		password.sendKeys("admin123");
	}

	public void clickLgnBtn() {
		loginButton.click();
	}

	public void enterInvalidUsername(String username) {
		login.sendKeys(username);
	}

	public void enterInvalidPwd(String password) {
		login.sendKeys(password);
	}

}
