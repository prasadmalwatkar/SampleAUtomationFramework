package waits.com.flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.com.flipkart.DriverSetup;

public class WebDriverExplicitWait extends DriverSetup {

	static WebDriverWait wait;
	static Duration timeout = Duration.ofSeconds(30);

	public static void visibilityOfElementLocated(By xpath) {
		try {
			wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void elementToBeClickable(By xpath) {
		try {
			wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void invisibilityOfElementLocated(By xpath) {
		try {
			wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void visibilityOfElementLocated(By xpath, Duration timeOut) {
		try {
			wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void elementToBeClickable(By xpath, Duration timeOut) {
		try {
			wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void invisibilityOfElementLocated(By xpath, Duration timeOut) {
		try {
			wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
