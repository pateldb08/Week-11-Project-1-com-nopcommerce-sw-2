package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {
    public static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);  // calling openBrowser method from BaseTest class(inheritance)
    }

//    @After
//    public void closeBrowser() {
//        driver.close();
//    }

    @Test
    public void varifyuserShouldNavigateToRegisterPageSuccessfully() {
        // Find Register link and click on it
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        // Varify the text 'Register'
        String expectedMessage = "Register";
        // Find actual text element('Register') by xpath and get its value and varify it in Assert statement
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Register')]"));
        String actualMessage = actualTextMessage.getText();
        Assert.assertEquals("user is not able to Register Account Successfully", expectedMessage, actualMessage);
    }

    @Test
    public void varifyuserSholdRegisterAccountSuccessfully() {
        //Find Register link and click on it
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        //Find Gender radio button and click on one radio button
        WebElement radiobtn = driver.findElement(By.id("gender-female")); // select female radio button element by id.
        radiobtn.click();                                                  // click on it
        // Find First name Field and pass/type first name in it
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Darshna");
        // Find Last name element and pass last name in it
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("3");//Select the day
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("8");//Select the Month
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1976");//Select the Year

        //Find Email field and pass value in it
        driver.findElement(By.id("Email")).sendKeys(getRandomEmail());  // calling getRandomEmail to pass random email everytime
        //Find Password field and type password in it
        driver.findElement(By.id("Password")).sendKeys("123456");
        //Find Confirm Password field and type password again to confirm it
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        // Find Register button and click on it
        WebElement registerbtn = driver.findElement(By.id("register-button"));
        registerbtn.click();
        // Verify the text 'Your registration completed'
        String expectedMessage= "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[contains(text(), 'Your registration completed')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Your Registration is Unsuccessful",expectedMessage,actualMessage);

    }

        public static String getRandomEmail() { // Method generating Random email everytime
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder random = new StringBuilder();
            Random rnd = new Random();
            while (random.length() < 10) { // length of the random string.
                int index = (int) (rnd.nextFloat() * chars.length());
                random.append(chars.charAt(index));
            }
            String email = random.toString() + "@gmail.com";
            return email;
        }
    }





