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


// public class milestone6activity1 {
//     WebDriver driver;
//     String ValidUsername = "validAdmin";
//     String ValidPassword = "validAdmin@pass";

//     @Before
//     public void setUp() throws MalformedURLException, InterruptedException {

//         driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//         driver = driverFac.getDriver();
//     }


    
//     @Given("User is Registered")
//     public void user_is_Registered() throws Throwable {
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(ValidUsername);

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ValidPassword);

//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys(ValidPassword);

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//         Thread.sleep(2000);
//     }

//     @And("user is on Home page")
//     public void user_IsOn_HomePage() {
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
//     }

//     @When("user enters validAdmin and validAdmin@pass")
//     public void user_Enters() {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(ValidUsername);
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ValidPassword);
//     }

//     @And("user clicks on login button")
//     public void user_clicks_on_login_button() throws Throwable, InterruptedException {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
//         Thread.sleep(2000);

//     }
//     @Then("successfully Login Message is displayed")
//     public void successfully_Login_Message_is_displayed() throws Throwable, InterruptedException {

//         String user=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();
//         Assert.assertEquals(ValidUsername, user);
//         Thread.sleep(2000);

// }


//     @When("user enters invalidAdmin and invalidAdmin@pass")
//     public void user_Enters_InvalidAdmin_And_InvalidAdminPass()throws Throwable, InterruptedException {

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("invalidAdmin");
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("invalidAdmin@pass");
//         Thread.sleep(2000);

//     }


//     @Then("username does not exist message should be displayed")
//     public void usernameDoesNotExistMessageShouldBeDisplayed()throws Throwable, InterruptedException{
//         String user=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();
//         Assert.assertNotEquals("testuser1", user);
//         Thread.sleep(2000);


//     }


//     @When("user enters {string} and {string}")
//     public void userEntersAnd(String arg0, String arg1) {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(" ");
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" ");
//     }

//     @Then("username is a required field message should be displayed")
//     public void usernameIsARequiredFieldMessageShouldBeDisplayed() {
//         System.out.println("username is a required field message");
//     }

// }