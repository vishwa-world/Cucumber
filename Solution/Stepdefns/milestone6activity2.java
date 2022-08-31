// package Stepdefns;

// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import java.net.MalformedURLException;



// public class milestone6activity2 {
//     WebDriver driver;

//     @Before
//     public void setUp() throws MalformedURLException, InterruptedException {
    
    
//             driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//             driver = driverFac.getDriver();
        
//         // register
//         driver.get("https://crio-qkart-frontend-qa.vercel.app");
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]")).click();

//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("testuser1@pass");

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

//         Thread.sleep(2000);

//     }



//     @Given("user is on Home Page")
//     public void user_IsOnHomePage() {
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
//     }

//     @When("user enters username and password")
//     public void user_Enters() {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");
//     }

//     @And("user clicks on login button")
//     public void user_clicks_on_login_button() throws Throwable, InterruptedException{
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
//         Thread.sleep(2000);

//     }

//     @Then("successfully Login Message is displayed")
//     public void successfully_Login_Message_is_displayed() throws Throwable, InterruptedException  {

//         Thread.sleep(2000);
//         String user=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();
//         Assert.assertEquals("testuser1", user);
//     }

//     @After
//     public void closebrowser(){
//         driver.close();
//     }


// }
