package com.basic.projects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YouTubeTest {
    @Test
    public void youtubeUrlandTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String ExpectedUrl = "https://www.youtube.com/";
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedUrl,ActualUrl,"URLs do not match");
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"YouTube page title does not match");
        driver.quit();
    }
}
