package webElement.hyperlink;

import java.util.List;

import org.openqa.selenium.By;
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

		//Check whether hyperlink is isDisplayed or not.
		isDisplay = webElement.isDisplayed();
		
		return isDisplay;
	}

	/**
	 * use this method to check whether hyperlink isEnabled or not
	 */
	public boolean checkElementIsEnabled(WebElement webElement) {
		boolean isEnable = false;
		
		// Check whether hyperlink is isEnabled or not.
		isEnable = webElement.isEnabled();
		
		return isEnable;
	}
	
	/**
	 * use this  method to get the count of links on page
	 * @param webElement
	 */
	public int totalLinksOnPage(List<WebElement> webElement) {
		int totalLinks = 0;
		
		//count the total number of links
		totalLinks = webElement.size();
		
		return totalLinks;
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
	 * use this method to get the text of hyperlink
	 * @return
	 */
	public String getText(WebElement webElement) {
		String text = null;
		
		//get the link text
		text = webElement.getText();
		
		return text;
	}
	
	
	/**
	 * use this methods to check give text is present in the link or not
	 * @param webElement
	 * @param text
	 */
	public void checkTextIsPresent(List<WebElement> webElement,String text) {
		
		// Check whether the given text is present in links 
		for(WebElement elem : webElement) {
			if(elem.getText().equals(text)) {
				System.out.println("Text is present in link :" + elem.getText());
			}else {
				System.out.println("Text is not present in the link :"+elem.getText());
			}
		}
	}
	
	/**
	 * use this method to perform click on hyperlink
	 */
	public void clickOnLink(WebElement webElement) {
		
		//Perform click operation on hyperlink
		webElement.click();
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
		learnHyperLink.openURL("https://web-locators-static-site-qa.vercel.app/Hyperlink");
		
		 //Step - 3 : Check whether the “Crio.Do” link 
		 //Locate the Link "Crio.do" and assign it to linkCrioDo
		 WebElement linkCrioDo = driver.findElement(By.partialLinkText("Crio.do"));
		 
		// Check Link "Crio.Do" is displayed - call the method checkElementIsDisplayed
		boolean isLinkDisplayed =  learnHyperLink.checkElementIsDisplayed(linkCrioDo);
		System.out.println("Crio.do page link is displayed : " +isLinkDisplayed);
		
		// Check Link "Crio.Do" is enabled - call the  method checkElementIsEnabled
		boolean isLinkEnabled =  learnHyperLink.checkElementIsEnabled(linkCrioDo);
		System.out.println("Go to an external page link is enabled : " +isLinkEnabled);
			
		 //Read the text “Crio.Do”.
		 String linkText = learnHyperLink.getText(linkCrioDo);
		 // Print the response.
        System.out.println("Go to an external page link text  is : " +linkText);  
        
        // Retrieve the “href” attribute value.
		String hrefOfLink = learnHyperLink.getAttributeValue(linkCrioDo, "href");		 
		// Print the response. 
		System.out.println("Go to an external page link href attribute value is : " +hrefOfLink);
		
		
		//Locate the Link "Find out how many links are available" and assign it to linkExternalPage
		WebElement linkExternalPage = driver.findElement(By.partialLinkText("Find out how many links are available"));
		
		//Perform the click on “Find out how many links are available”.
		learnHyperLink.clickOnLink(linkExternalPage);
		
		//Count the total hyper links present on the web page - Locate all the links and assign to totalLinks and call the method totalLinksOnPage.
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int totalLink = learnHyperLink.totalLinksOnPage(totalLinks);
		//Print the response.
		System.out.println("Total links present on page : " +totalLink);
		
		// How many links are visible and not-visible. pass totalLinks one by one link to method checkElementIsDisplayed.  
		for(WebElement link : totalLinks) {
			if(learnHyperLink.checkElementIsDisplayed(link)) {
				System.out.println("Link is visible on the page.");
			}else {
				System.out.println("Link is not visible on the page.");
			}
		}
		
		// How many links are having text ”Crio.Do” - pass totalLinks one by one link to method checkTextIsPresent.
		learnHyperLink.checkTextIsPresent(totalLinks, "Crio.Do");
		 
		// Call the method closeBrowser
		learnHyperLink.closeBrowser();
	}
}
