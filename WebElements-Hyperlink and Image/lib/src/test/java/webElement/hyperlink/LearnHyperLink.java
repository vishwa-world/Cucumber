package webElement.hyperlink;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHyperLink {
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
	 * use this method to check whether hyperlink isDisplayed or not
	 * 
	 */
	public boolean checkElementIsDisplayed(WebElement webElement) {
		boolean isDisplay = false;

		// TODO : Check whether hyperlink is isDisplayed or not.
		
		return isDisplay;
	}

	/**
	 * use this method to check whether hyperlink isEnabled or not
	 */
	public boolean checkElementIsEnabled(WebElement webElement) {
		boolean isEnable = false;
		
		// TODO : Check whether hyperlink is isEnabled or not.
		
		return isEnable;
	}
	
	/**
	 * use this  method to get the count of links on page
	 * @param webElement
	 */
	public int totalLinksOnPage(List<WebElement> webElement) {
		int totalLinks = 0;
		
		//TODO : count the total number of links
		
		return totalLinks;
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
	 * use this method to get the text of hyperlink
	 * @return
	 */
	public String getText(WebElement webElement) {
		String text = null;
		//TODO : get the link text
		
		return text;
	}
	
	/**
	 * use this methods to check give text is present in the link or not
	 * @param webElement
	 * @param text
	 */
	public void checkTextIsPresent(List<WebElement> webElement,String text) {
		
		//TODO : Check whether the given text is present in links 
		
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

	public static void main(String[] args) {
		
		// Create the object of LearnCheckbox class
		LearnHyperLink learnHyperLink = new LearnHyperLink();

		// Step - 1 : Call the method startBrowser
		 WebDriver driver = learnHyperLink.startBrowser();

		// Step - 2 : Call the method openURL
		learnHyperLink.openURL("https://web-locators-static-site-qa-gilt.vercel.app/Checkbox");
		
		 
		 WebElement linkCrioDo;
		 
		 

		 /**
			 * Step - 3 : Check whether the “Crio.Do” link 
			 * TODO : Locate the Link "Crio.Do" and assign it to linkExternalPage
			 * TODO : Check Link "Crio.Do" is displayed - call the method checkElementIsDisplayed
			 * TODO : Check Link "Crio.Do" is enabled - call the  method checkElementIsEnabled
			 * TODO : Read the text “Crio.Do”.
             * TODO : Print the response.
             * TODO : Retrieve the “href” attribute value.
             * TODO : Print the response. 
			 */
		
		WebElement linkExternalPage;
		List<WebElement> totalLinks;
			/**
			 * Step - 4  Perform the click on “Find out how many links are available”.
			 * TODO : Locate the Link "Find out how many links are available" and assign it to linkExternalPage1
			 * TODO : Count the total hyper links present on the web page - Locate all the links and assign to totalLinks and call the method totalLinksOnPage.
			 * TODO : Print the response.
			 * TODO : How many links are visible and not-visible. pass totalLinks one by one link to method checkElementIsDisplayed.  
			 * TODO : Print the response
			 * TODO : How many links are having text ”Crio.Do” - pass totalLinks one by one link to method checkTextIsPresent.
			 * 
			 */
		
		 
		// Call the method closeBrowser
		learnHyperLink.closeBrowser();
	}
}
