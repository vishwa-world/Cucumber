package webElement.image;

import java.util.List;

import org.openqa.selenium.By;
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

		// Check whether image is isDisplayed or not.
		isDisplay = webElement.isDisplayed();
		
		return isDisplay;
	}	


	/**
	 * use this method to retrieve the attribute value
	 * @param webElement
	 * @return
	 */
	public String getAttributeValue(WebElement webElement,String attributeName) {
		String attributeValue = null;
		
		// Retrieve attribute value
		attributeValue = webElement.getAttribute(attributeName);
		
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
		
		 //Step - 3 : Check whether the “two eyes” image is displayed.
		 //Locate the image "two eyes" and assign it to imgTwoEyes
		 WebElement imgTwoEyes = driver.findElement(By.xpath("//img[@alt='image_screen']"));
		 
		// Check image "two eyes" is displayed - call the method checkElementIsDisplayed
		boolean isTwoEyeImgDisplayed = learnImage.checkElementIsDisplayed(imgTwoEyes);	
		System.out.println("Two eyes image is displayed : "+isTwoEyeImgDisplayed);
		
		//Step - 4  Retrieve and print the values of both images (“two eyes”,”broken image”) image
		//Locate the image "broken image" and assign it to imgBrokenImg
		WebElement imgBrokenImg = driver.findElement(By.xpath("//img[@alt='broken_image']"));
	   
		//Retrieve src attribute value - imgTwoEyes 
		String srcValueTwoEyes = learnImage.getAttributeValue(imgTwoEyes, "src");
		//Print the response.
		System.out.println("src attribute value of two eyes image is : "+srcValueTwoEyes);
		
		//Retrieve alt attribute value - imgTwoEyes 
		String altValueTwoEyes = learnImage.getAttributeValue(imgTwoEyes, "alt");
		//Print the response.
		System.out.println("alt attribute value of two eyes image is : "+altValueTwoEyes);
	
		//Retrieve src attribute value - Broken image 
		String srcValueBrokenImage = learnImage.getAttributeValue(imgBrokenImg, "src");
		//Print the response.
		System.out.println("src attribute value of broken image is : "+srcValueBrokenImage);
				
		//Retrieve alt attribute value - Broken image 
		String altValueBrokenImage = learnImage.getAttributeValue(imgBrokenImg, "alt");
		//Print the response.
		System.out.println("alt attribute value of two broken image is : "+altValueBrokenImage);
			
		// Call the method closeBrowser
		learnImage.closeBrowser();
	}
}
