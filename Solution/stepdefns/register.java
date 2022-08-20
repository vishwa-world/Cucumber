// package Stepdefns;

// import io.cucumber.java.en.Given;
// import java.net.MalformedURLException;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;

// public class register {
//     static WebDriver driver;


//     public static WebDriver getDriver () throws MalformedURLException{
//         driverFactory driverFac = driverFactory.getInstanceOfSingletonBrowserClass();
//         driver = driverFac.getDriver();
//         return driver;
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
// }
