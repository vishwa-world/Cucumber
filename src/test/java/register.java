import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.BrowserType;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;



public class register {
    WebDriver driver;

   @Before
   public void setUp()throws Throwable {
   final DesiredCapabilities capabilities = new DesiredCapabilities();
   capabilities.setBrowserName(BrowserType.CHROME);
   driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   Thread.sleep(5000);
   }



   @Given("user is on Register Page")
   public void user_is_on_Register_Page() throws Throwable {

       driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
   }

   @When("user enters credentials and clicks on Register button")
   public void user_enters_credentials(DataTable usercredentials) throws Throwable {



       List<Map<String, String>> user = usercredentials.asMaps(String.class, String.class );
       System.out.println(user);

       String userName = user.get(0).get("UserName");
       driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);

       String passWord = user.get(0).get("Password");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);

       String confirmPassword = user.get(0).get("Confirm_Password");
       driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys(confirmPassword);

       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
   }




   @Then("Successfully Registered Message is displayed")
   public void successfully_Login_Message_is_displayed() throws Throwable {

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       System.out.println("Register Successful");
   }

@After
   public void tearDown(){
       driver.close();
}


}

    
