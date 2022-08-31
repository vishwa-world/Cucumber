// package Stepdefns;

// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import java.net.MalformedURLException;


// public class milestone5activity2 {
//     WebDriver driver;

//     @Before
//     public void setUp() throws MalformedURLException, InterruptedException {

//         driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//         driver = driverFac.getDriver();

//     }
//         @Given("User is Registered")
//         public void user_is_Registered() throws Throwable {
//         // register
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//         Thread.sleep(2000);

//         //register
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin1");

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin@pass");

//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("admin@pass");

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();     

//     }


//     @And("User is on Home Page")
//     public void user_is_on_Home_Page() throws Throwable {

//         driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
//     }

//     @When("user enters {string} and {string}")
//     public void user_enters(String username, String password) throws Throwable  {

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//         Thread.sleep(3000);

//     }

//     @Then("user clicks on Login button")
//     public void user_clicks_on_login_button() throws Throwable {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//     }

//     @Then("successfully Login Message is displayed")
//     public void successfully_Login_Message_is_displayed() throws Throwable {

//       Thread.sleep(3000);
     
//         String user = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();

//         if(user == "testuser1" || user == "admin1") {
//             Assert.assertTrue(true);
//         }
//         else{
//             Assert.assertFalse(false);
//         }

//     }

//     }


