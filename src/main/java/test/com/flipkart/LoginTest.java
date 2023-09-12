package test.com.flipkart;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pom.com.flipkart.LoginPage;
import utilities.com.flipkart.JSONFileReader;

public class LoginTest extends DriverSetup {

	JSONFileReader testdata = new JSONFileReader();

	public LoginTest() {
		super();
	}

	LoginPage loginPage;
	
	/*
	 * Here all the test cases related to login page
	 * */

	@Severity(SeverityLevel.BLOCKER)
	@Epic("Regression Test")
	@Feature("Login Test")
	@Test(priority = 1, description = "Verify whether user is able to login with valid username and password and logging out ")
	public void loginWithValidCredentials() throws InterruptedException, IOException, ParseException {
		loginPage = new LoginPage();
	}
}
