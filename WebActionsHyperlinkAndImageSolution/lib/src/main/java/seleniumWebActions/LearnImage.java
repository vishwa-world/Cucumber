package seleniumWebActions;

import java.util.List;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;

public class LearnImage {

	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
	 */
	public WebDriver startBrowser() throws MalformedURLException {
		System.out.println("Starting the browser...");

		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);

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
		boolean isDisplayed = false;

		// TODO : Check whether image is displayed or not.
		isDisplayed = webElement.isDisplayed();

		return isDisplayed;
	}

	/**
	 * use this method to retrieve the attribute value
	 * 
	 * @param webElement
	 * @return
	 */
	public String getAttributeValue(WebElement webElement, String attributeName) {
		String attributeValue = null;

		// TODO : Retrieve attribute value
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

	public static void main(String[] args) throws MalformedURLException {

		// Create the object of LearnCheckbox class
		LearnImage learnImage = new LearnImage();

		// Step - 1 : Call the method startBrowser
		WebDriver driver = learnImage.startBrowser();

		// Step - 2 : Call the method openURL
		learnImage.openURL("https://web-locators-static-site-qa-gilt.vercel.app/Image");

		// Step - 3 : Check whether the "two eyes" image is displayed
		// WebElement imgTwoEyes;
		// TODO: Locate the image "two eyes" and assign it to imgTwoEyes
		WebElement imgTwoEyes = driver.findElement(By.xpath("//img[@alt='image_screen']"));

		// TODO: Check image "two eyes" is displayed - call the method
		// checkElementIsDisplayed()
		boolean isTwoEyeImgDisplayed = learnImage.checkElementIsDisplayed(imgTwoEyes);
		System.out.println("Two eyes image is displayed : " + isTwoEyeImgDisplayed);

		// Step - 4 Retrieve and print the values of both images ("two eyes","broken
		// image") image
		// WebElement imgBrokenImg;
		// TODO: Locate the image "broken image" and assign it to imgBrokenImg
		WebElement imgBrokenImg = driver.findElement(By.xpath("//img[@alt='broken_image']"));

		// TODO: Retrieve src attribute value - imgTwoEyes
		String srcValueTwoEyes = learnImage.getAttributeValue(imgTwoEyes, "src");

		// TODO: Print the src attribute value
		System.out.println("src attribute value of two eyes image is : " + srcValueTwoEyes);

		// TODO: Retrieve alt attribute value - imgTwoEyes
		String altValueTwoEyes = learnImage.getAttributeValue(imgTwoEyes, "alt");

		// TODO: Print the alt attribute value
		System.out.println("alt attribute value of two eyes image is : " + altValueTwoEyes);

		// TODO: Retrieve src attribute value - Broken image
		String srcValueBrokenImage = learnImage.getAttributeValue(imgBrokenImg, "src");

		// TODO: Print the src attribute value
		System.out.println("src attribute value of broken image is : " + srcValueBrokenImage);

		// TODO: Retrieve alt attribute value - Broken image
		String altValueBrokenImage = learnImage.getAttributeValue(imgBrokenImg, "alt");

		// TODO: Print the alt attribute value
		System.out.println("alt attribute value of two broken image is : " + altValueBrokenImage);

		// Call the method closeBrowser
		learnImage.closeBrowser();
	}
}