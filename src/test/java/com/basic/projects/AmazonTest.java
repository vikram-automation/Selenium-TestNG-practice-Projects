package com.basic.projects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void urlTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String expectedUrl = "https://www.amazon.in/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"URLs do not match");
        driver.quit();
    }
}
