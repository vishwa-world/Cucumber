package Stepdefns;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class driverFactory {

	// instance of singleton class
	private static driverFactory instanceOfSingletonBrowserClass=null;
	
	
    private WebDriver driver;

    // Constructor
    private driverFactory() throws MalformedURLException{

    	final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
    }

    public static driverFactory getInstanceOfSingletonBrowserClass() throws MalformedURLException{
        if(instanceOfSingletonBrowserClass==null){
        	instanceOfSingletonBrowserClass = new driverFactory();
        }
        return instanceOfSingletonBrowserClass;
    }
    public WebDriver getDriver()
    {
    	return driver;
    }

}
