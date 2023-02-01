package webDriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class test1 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        driver.manage().window().maximize();
        driver.close();
    }
}
