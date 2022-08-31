// package Stepdefns;

// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.junit.Assert;
// import java.net.MalformedURLException;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;


// public class background{

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

//     @And("User navigates to the login page")
//     public void userNavigatesToTheLoginPage() {
//         driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
//     }

//     @When("User submits username and password")
//     public void userSubmitsUsernameAndPassword() {
//         driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");

//         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");
//     }

//     @Then("User clicks on login button")
//     public void userClicksOnLoginButton() throws Throwable {
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();
//         Thread.sleep(2000);
//     }


//     @Given("User search for shoe")
//     public void userSearchForShoe() throws Throwable{
//         WebElement search= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/input"));
//         search.sendKeys("shoe");
//         Thread.sleep(2000);

//     }

//     @When("Add the first result to the basket")
//     public void addTheFirstResultToTheBasket()throws Throwable {
//         WebElement add= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/div/div[2]/button"));
//         add.click();
//         Thread.sleep(2000);
        
//     }

//     @Then("User basket should display with added item")
//     public void userBasketShouldDisplayWithAddedItem()throws Throwable {

//             String expectedResult= "Roadster Mens Running Shoes";
//             String actualResult= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div/div[1]/div/div[2]/div[1]")).getText();

//             Assert.assertEquals(expectedResult, actualResult);

//         }

// }