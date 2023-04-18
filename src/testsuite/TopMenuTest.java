package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //    @After
//    public void tearDown() {
//        closeBrowser();
//    }
    @Test
    public void varifyuserShouldNavigateToComputerPageSuccessfully() {
        //Find 'Computers' tab and click on it
        WebElement computers = driver.findElement(By.linkText("Computers"));
        computers.click();
        // varify the text 'computers'
        String expectedMessage = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("User is not able to Navigate to Comupter page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Find 'Electronics' tab and click on it
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        // varify the text 'Electronics'
        String expectedMessage = "Electronics";
        WebElement actualTextElements = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals("User is not able to Navigate to Electonics page", expectedMessage, actualMessage);
    }

    @Test
    public void varifyuserShouldNavigateToApparelPageSuccessfully() {
        //Find Apparel tab and click on it
        WebElement electronics = driver.findElement(By.linkText("Apparel"));
        electronics.click();
        // varify the text ''
        String expectedMessage = "Apparel";
        WebElement actualTextElements = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals("User is not able to Navigate to Electonics page", expectedMessage, actualMessage);
    }

    @Test
    public void varifyuserShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Find Digital downloads tab and click on it
        WebElement digiDLoad = driver.findElement(By.linkText("Digital downloads "));
        digiDLoad.click();
        // Verify the text 'Digital downloads'
        String expectedMessage = "Digital downloads";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String acctualMessage = actualTextMessage.getText();
        Assert.assertEquals("User is not able to Navigate to DigitalDownloads page", expectedMessage, acctualMessage);
    }
    @Test
    public void varifyuserShouldNavigateToBooksPageSuccessfully(){
        //Find Books tab and click on it
        WebElement book = driver.findElement(By.linkText("Books"));
        book.click();
        // Verify the text 'Digital downloads'
        String expectedMessage = "Books";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String acctualMessage = actualTextMessage.getText();
        Assert.assertEquals("User is not able to Navigate to DigitalDownloads page", expectedMessage, acctualMessage);
    }
    @Test
    public void varifyuserShouldNavigateToJewelryPageSuccessfully(){
        //Find Jewelry tab and click on it
        WebElement jewelry= driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        // Verify the text 'Jewelry'
        String expectedMessage = "Jewelry";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry ')]"));
        String acctualMessage = actualTextMessage.getText();
        Assert.assertEquals("User is not able to Navigate to DigitalDownloads page", expectedMessage, acctualMessage);
    }
    @Test
    public void varifyuserShouldNavigateToGiftCardsPageSuccessfully(){
        //Find Gift Cards tab and click on it
        driver.findElement(By.linkText("Gift Cards")).click();
        // Verify the text 'Gift Cards'
        String expectedMessage = "Gift Cards";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String acctualMessage = actualTextMessage.getText();
        Assert.assertEquals("User is not able to Navigate to DigitalDownloads page", expectedMessage, acctualMessage);
    }

    }

