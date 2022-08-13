package Stepdefns;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class milestone6activity3 {
    WebDriver driver;


    @Before
    public void setUp() throws MalformedURLException, InterruptedException {

        driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
        driver = driverFac.getDriver();
    }

    
    @Given("User is Registered")
    public void user_is_Registered() throws Throwable {
        driver.get("https://crio-qkart-frontend-qa.vercel.app/register");

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");

        driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("testuser1@pass");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

        Thread.sleep(2000);
    }

    @Before("@Search")
    public void beforeSearch(){

        System.out.println("This will run before search scenario");
    }

    @And("User is on Home Page")
    public void user_IsOnHomePage() {
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
    }

    @When("user enters credentials")
    public void user_Enters() {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testuser1");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("testuser1@pass");
    }

    @And("user clicks on Login button")
    public void user_clicks_on_login_button() throws Throwable, InterruptedException  {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button")).click();

    }

    @Then("successfully Login Message is displayed")
    public void successfully_Login_Message_is_displayed() throws Throwable, InterruptedException  {

        Thread.sleep(2000);
        String user=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/p")).getText();
        Assert.assertEquals("testuser1", user);
    }


    @Given("user search for shoe")
    public void user_SearchForShoe()throws InterruptedException  {
        Thread.sleep(2000);
        WebElement search= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/input"));
        search.sendKeys("shoe");
        Thread.sleep(2000);
    }


    @When("add the first result to the basket")
    public void add_TheFirstResultToTheBasket()throws Throwable, InterruptedException {


        WebElement add= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/div/div[2]/button"));
        add.click();
        Thread.sleep(2000);

    }


    @Then("user basket should display with added item")
    public void user_BasketShouldDisplayWithAddedItem() throws Throwable, InterruptedException{


        String expectedResult= "Roadster Mens Running Shoes";
        String actualResult= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/div/div[1]/p[1]")).getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

  @After("@Search")
    public void closeBrowser(){
        System.out.println("This will run after search scenario");
    }


}
