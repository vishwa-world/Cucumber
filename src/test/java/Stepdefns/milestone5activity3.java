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

// public class milestone5activity3 {
//     WebDriver driver;
          
//         @Before
//         public void setUp() throws MalformedURLException, InterruptedException {
    
//             driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//             driver = driverFac.getDriver();
//         }




//     @Given("user is on Register page")
//     public void user_IsOn_RegisterPage() throws InterruptedException {
//         driver.get("https://crio-qkart-frontend-qa.vercel.app");
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]")).click();
//         Thread.sleep(2000);
//     }

//     @When("user enters {string} and {string} and {string}")
//     public void user_Enters(String username, String password, String confirmPassword)throws InterruptedException {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys(confirmPassword);
//         Thread.sleep(2000);
//     }

//     @And("user clicks on Register button")
//     public void user_clicks_on_Register_button() throws Throwable {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
//         Thread.sleep(2000);

//     }
//     @Then("successfully Registered Message is displayed")
//     public void successfully_Registered_Message_is_displayed() throws Throwable {
//         Thread.sleep(2000);
//         String message = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
//        Assert.assertEquals("Registered Successfully", message);
//     }


// }