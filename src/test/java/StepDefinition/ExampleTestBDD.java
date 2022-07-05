package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ExamplePage;
import pageObjects.HomePage;
import utils.TestBase;

public class ExampleTestBDD extends TestBase {

	public ExampleTestBDD() throws IOException {
		super(); // executer test base constructror

	}

	ExamplePage examplePage;
	HomePage homePage;

	@Before
	public void setUp() {

		initialization();

		
	}

	@Given("I open orange application")
	public void i_open_orange_application() {
		driver.get("https://opensource-demo.orangehrmlive.com");
	}


	@When("I enter login")
	public void i_enter_login() {
		examplePage = new ExamplePage(driver);
		examplePage.enterLogin();
	}

	@When("I enter pwd")
	public void i_enter_pwd() {
		
		examplePage.enterPwd();
	}

	
	
	@When("I click on login button")
	public void i_click_on_login_button() {
		examplePage.clickLgnBtn();
	}
	
	@Then("Home should be displayed")
	public void home_should_be_displayed() {
		homePage = new HomePage(driver);
		homePage.checkIdent();	
	}
	
	
	@When("I enter IL {string}")
	public void i_enter_il(String username) {
		examplePage = new ExamplePage(driver);
		examplePage.enterInvalidUsername(username);
	}

	@When("I enter  IP {string}")
	public void i_enter_ip(String pwd) {
		examplePage.enterInvalidPwd(pwd);
	}

	@Then("An error message displayed")
	public void an_error_message_displayed() {
	   
	}
	
	@After
	public void quit() {
		driver.quit();
	}

}
