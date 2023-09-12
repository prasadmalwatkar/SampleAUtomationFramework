package test.com.flipkart;

import java.io.IOException;
import java.time.Duration;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.com.flipkart.JSONFileReader;

public class DriverSetup {

	public static WebDriver driver;

	@BeforeSuite
	static void setupClass() {

	}

	@BeforeClass
	void setupTest() {
		JSONFileReader testdata = new JSONFileReader();
		String browserName;
		try {
			browserName = testdata.fileReader("browsers", "browsername");
			if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications"); // to disable notification
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
			} else if (browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--disable-notifications"); // to disable notification
				driver = new FirefoxDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
			} else if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--disable-notifications"); // to disable notification
				driver = new EdgeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	void teardown() {
		driver.quit();
	}
}
