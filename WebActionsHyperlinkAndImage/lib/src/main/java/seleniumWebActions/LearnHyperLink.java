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

public class LearnHyperLink {

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
	 * use this method to check whether hyperlink isDisplayed or not
	 * 
	 */
	public boolean checkElementIsDisplayed(WebElement webElement) {
		boolean isDisplayed = false;

		// TODO : Check whether hyperlink is isDisplayed or not

		return isDisplayed;
	}

	/**
	 * use this method to check whether hyperlink isEnabled or not
	 */
	public boolean checkElementIsEnabled(WebElement webElement) {
		boolean isEnabled = false;

		// TODO : Check whether hyperlink is isEnabled or not

		return isEnabled;
	}

	/**
	 * use this method to get the count of links on page
	 * 
	 * @param webElement
	 */
	public int totalLinksOnPage(List<WebElement> webElement) {
		int totalLinks = 0;

		// TODO : Count the total number of links

		return totalLinks;
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

		return attributeValue;
	}

	/**
	 * use this method to get the text of hyperlink
	 * 
	 * @return
	 */
	public String getText(WebElement webElement) {
		String text = null;

		// TODO : get the link text

		return text;
	}

	/**
	 * use this methods to check give text is present in the link or not
	 * 
	 * @param webElement
	 * @param text
	 */
	public void checkTextIsPresent(List<WebElement> webElement, String text) {
		// TODO : Check whether the given text is present in links

	}

	/**
	 * use this method to perform click on hyperlink
	 */
	public void clickOnLink(WebElement webElement) {
		// TODO : Perform click operation on hyperlink
	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public void run() throws MalformedURLException {

	
		// Step - 1 : Call the method startBrowser
		WebDriver driver = this.startBrowser();

		// Step - 2 : Call the method openURL
		this.openURL("https://web-locators-static-site-qa.vercel.app/hyperlink");

		// Step - 3 : Check whether the "Crio.Do" link is displayed
		WebElement linkCrioDo;
		// TODO: Locate the Link "Crio.do" and assign it to linkCrioDo

		// TODO: Check Link "Crio.Do" is displayed - call the method
		// checkElementIsDisplayed()

		// TODO: Check if the link "Crio.Do" is enabled - call the method
		// checkElementIsEnabled()

		// TODO: Read the text from the hyperlink

		// TODO: Print the link text

		// TODO: Retrieve the "href" attribute value.

		// TODO: Print the href


		WebElement linkExternalPage;
		// TODO: Locate the Link "Find out how many links are available" and assign it
		// to linkExternalPage

		// TODO: Click on link under the "Find out how many links are available" text


		List<WebElement> totalLinks;
		// TODO: Count the total hyper links present on the web page - Locate all the
		// links, assign to totalLinks and call the method totalLinksOnPage()

		// TODO: Print the count of links

		// TODO: Find number of visible and not-visible links by passing totalLinks
        // links one by one to method checkElementIsDisplayed()

		// TODO: How many links are having text "Crio.Do" - pass totalLinks one by one
		// link to method checkTextIsPresent()

		// Call the method closeBrowser
		this.closeBrowser();
	}
}
