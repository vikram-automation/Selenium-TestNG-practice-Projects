package com.basic.projects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetflixTest {
    @Test
    public void HeadingandUrlTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        String ExpectedUrl = "https://www.netflix.com/in/";
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedUrl,ActualUrl,"Netflix page title does not match");
        String ExpectedTitle = "Netflix India – Watch Shows Online, Watch Movies Online";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle,"Netflix page heading does not match");
        driver.quit();
    }
}
