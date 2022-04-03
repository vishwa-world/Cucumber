package webElement.image;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImage {
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
	 * @param browserName
	 */
	public WebDriver startBrowser() {
		// set DriverManager
		WebDriverManager.chromedriver().timeout(3000).setup();

		// Creating the object of chromeDriver
		System.out.println("Creating the object of ChromeDriver : ");
		driver = new ChromeDriver();
		
		return driver;
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {

		System.out.println("maximize the window..");
		driver.manage().window().maximize();

		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);
	}

	/**
	 * use this method to check whether image isDisplayed or not
	 * 
	 */
	public boolean checkElementIsDisplayed(WebElement webElement) {
		boolean isDisplay = false;

		// TODO : Check whether image is isDisplayed or not.
		
		return isDisplay;
	}


	/**
	 * use this method to retrieve the attribute value
	 * @param webElement
	 * @return
	 */
	public String getAttributeValue(WebElement webElement,String attributeName) {
		String attributeValue = null;
		
		// TODO : Retrieve attribute value
		
		return attributeValue;
	}
	
	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public static void main(String[] args) {
		
		// Create the object of LearnCheckbox class
		LearnImage learnImage = new LearnImage();

		// Step - 1 : Call the method startBrowser
		 WebDriver driver = learnImage.startBrowser();

		// Step - 2 : Call the method openURL
		learnImage.openURL("https://web-locators-static-site-qa-gilt.vercel.app/Image");
		
		 
		 WebElement imgTwoEyes;
		 
		 

		 /**
			 * Step - 3 : Check whether the “two eyes” image is displayed.
			 * TODO : Locate the image "two eyes" and assign it to imgTwoEyes
			 * TODO : Check image "two eyes" is displayed - call the method checkElementIsDisplayed
			*/
		
		
		WebElement imgBrokenImg;
			/**
			 * Step - 4  Retrieve and print the values of both images (“two eyes”,”broken image”) image
			 * TODO : Locate the image "broken image" and assign it to imgBrokenImg
			 * TODO : Retrieve src attribute value - imgTwoEyes 
			 * TODO : Print the response.
			 * TODO : Retrieve alt attribute value - imgTwoEyes 
			 * TODO : Print the response.
			 * TODO : Retrieve alt attribute value - imgBrokenImg 
			 * TODO : Print the response.
			 */
		
		 
		// Call the method closeBrowser
		learnImage.closeBrowser();
	}
}
