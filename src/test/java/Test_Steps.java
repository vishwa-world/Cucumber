import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
// import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_Steps {
    WebDriver driver;

    @Given("User is on Home Page")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("Test - user_is_on_home_page");
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);

        
        // driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
        // assertTrue(false);
    }

    // @Given("User is on Home Page")
    // public void user_is_on_home_page() {
    // throw new io.cucumber.java.PendingException();
    // }
    // @Given("User is on Home Page")
    // public void user_is_on_home

    @When("^User enters UserName and Password$")
    public void user_enters_username_and_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");
    }

    @And("^click on submit button$")
    public void user_clicks_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

    }

    @Then("^User logged in Successfully$")
    public void successfully_login_message_is_displayed() throws Throwable {
        System.out.println("Login Successful");
    }

}
