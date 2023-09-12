package utilities.com.flipkart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;



public class JavaUtils {

	public static String getCurrentDateTimeStamp() {
		return DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").format(LocalDateTime.now());
	}

	public static String randomStringGenerator(int numberOfChar) {
		return RandomStringUtils.randomAlphabetic(numberOfChar);
	}

	public static int generateRandomNumber(int numLength) {
		return numLength < 1 ? 0
				: new Random().nextInt((9 * (int) Math.pow(10, numLength - 1)) - 1) + (int) Math.pow(10, numLength - 1);
	}

	public static String trimString(String str) {
        String[] splits = str.split("\\s");
        return splits[2];
		
	}
	
	public static void main(String args[]) {
		System.out.println();
	}
}
