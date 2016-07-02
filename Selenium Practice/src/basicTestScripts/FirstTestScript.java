package basicTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirstTestScript {

	public static void main(String[] args) {
	
		//@SuppressWarnings("unused")
		
		//FirefoxProfile fp = new FirefoxProfile();
		//fp.setPreference("browser.startup.homepage", "http://www.google.com");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cnn.com");
		String s= driver.getTitle();
		System.out.println(s);
		//driver.get("http://www.google.com");
		

	}

}
