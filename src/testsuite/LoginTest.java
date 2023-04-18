package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
@Test
public void verifyUserShouldNavigateToLoginPageSuccessfully(){
    // Find Login link and click on login link
    WebElement loginlink = driver.findElement(By.linkText("Log in"));
    loginlink.click();;
    String expectedMessage = "Welcome, Please Sign In!";
    WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Not redirected to login page" , expectedMessage, actualMessage);
}
@Test
public void verifyuserShouldLoginSuccessfullyWithValidCredentials(){
        // Find Login Link and click on login link
    WebElement loginlink = driver.findElement(By.linkText("Log in"));
    loginlink.click();
    //Find Email Field element and type the Email address to Email Field element
    driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
    //Find Password field element and type/send the Password to password field
    driver.findElement(By.id("Password")).sendKeys("Prime123");
    // Find the Login button Element and click
    WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    loginbtn.click();

    String expectedMessage = "Log out";
    WebElement actualTextElement= driver.findElement(By.linkText("Log out"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Login Failed" , expectedMessage, actualMessage);

}
@Test
    public void verifyTheErrorMessage(){
       //Find Login link and click on login link
    WebElement loginlink = driver.findElement(By.linkText("Log in"));
    loginlink.click();
    // Find Email field element
    WebElement emailfiled = driver.findElement(By.id("Email"));
    // Type the Email address to Email Field element
    emailfiled.sendKeys("prime@gmail.com");
    //Find the Password Field element and send the password to Password Field
    driver.findElement(By.id("Password")).sendKeys("Prime1");
    // Find the Login Button and Click on it
    WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    loginbtn.click();

    // Verify the Error message
    String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    WebElement actualTextElement = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Login was unsuccessful.Please correct the errors and try again. No customer account found", expectedMessage ,actualMessage);
}
@After
    public void tearDown(){
        closeBrowser();
}

}
