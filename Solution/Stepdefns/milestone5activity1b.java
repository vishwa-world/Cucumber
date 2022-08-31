// package Stepdefns;

// import io.cucumber.datatable.DataTable;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.junit.Assert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import java.net.MalformedURLException;
// import java.util.List;
// import java.util.Map;

// public class milestone5activity1b {
//     WebDriver driver;



//     @Before
//     public void setUp() throws MalformedURLException, InterruptedException {

//         driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//         driver = driverFac.getDriver();
//          Thread.sleep(2000);

//     }



//     @Given("user is on Register Page")
//     public void user_is_on_Register_Page() throws Throwable {

//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
//     }

//     @When("user enters credentials and clicks on Register button")
//     public void user_enters_credentials(DataTable usercredentials) throws Throwable {

//         driver.get("https://crio-qkart-frontend-qa.vercel.app/register");


//         List<Map<String, String>> user = usercredentials.asMaps(String.class, String.class );
//         System.out.println(user);

//         String userName = user.get(0).get("UserName");
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);

//         String passWord = user.get(0).get("Password");
//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);

//         String confirmPassword = user.get(0).get("Confirm_Password");
//         driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys(confirmPassword);

//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
//     }

//     @Then("Successfully Registered Message is displayed")
//     public void successfully_Login_Message_is_displayed() throws Throwable {
//         Thread.sleep(3000);
//         String message = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
//         Assert.assertEquals("Registered Successfully", message);
       
//     }

// }