package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class test1 {
    private WebDriver driver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @BeforeMethod
    protected final void setupTest() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    protected final void testClose() {
        if (this.driver != null) {
            this.driver.close();
        }
    }


    @Test
    public void addRemoveElements() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addTwoElements = driver.findElement(By.
                xpath("//*[text()='Add Element']"));
        addTwoElements.click();
        addTwoElements.click();
        WebElement firstElement = driver.findElement(By.
                xpath("(//*[@class='added-manually'])[1]"));
        firstElement.click();
    }

    @Test
    public void checkBox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement firstBox = driver.findElement(By.
                xpath("(//*[@type='checkbox'])[1]"));
        firstBox.click();

        Assert.assertTrue(firstBox.isSelected(),
                "The box is not selected!");

        firstBox.click();

        Assert.assertFalse(firstBox.isSelected(),"The box is selected!");
    }




}