// package Stepdefns;

// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import java.net.MalformedURLException;
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;

// public class milestone3activity1 {
//     WebDriver driver;

//     @Before
//     public void setUp() throws MalformedURLException, InterruptedException {

//         driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//         driver = driverFac.getDriver();
//     }

//     @Given("User is Registered")
//     public void user_is_Registered() throws Throwable {
        
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//         Thread.sleep(2000);
//     }

//     @And("User is on Home Page")
//     public void user_is_on_home_page() throws Throwable {

//         driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
//         Thread.sleep(3000);
//     }


//     @When("^User enters UserName and Password$")
//     public void user_enters_username_and_password() throws Throwable {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");

//     }

//     @And("^click on submit button$")
//     public void user_clicks_on_login_button() throws Throwable {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//     }

//     @Then("^User logged in Successfully$")
//     public void successfully_login_message_is_displayed() throws Throwable {
//         Thread.sleep(3000);
//         String user =
//                 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();
//         Assert.assertEquals("testuser1", user);

//     }

// }
