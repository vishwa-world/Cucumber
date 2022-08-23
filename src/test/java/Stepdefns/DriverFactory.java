package Stepdefns;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverFactory {

	// instance of singleton class
	private static DriverFactory instanceOfSingletonBrowserClass=null;
	
	
    private WebDriver driver;

    // Constructor
    private DriverFactory() throws MalformedURLException{

    	final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
    }

    public static DriverFactory getInstanceOfSingletonBrowserClass() throws MalformedURLException{
        if(instanceOfSingletonBrowserClass==null){
        	instanceOfSingletonBrowserClass = new DriverFactory();
        }
        return instanceOfSingletonBrowserClass;
    }
    public WebDriver getDriver()
    {
    	return driver;
    }

}
