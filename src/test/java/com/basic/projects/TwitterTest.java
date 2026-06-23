package com.basic.projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterTest {
    @Test
    public void VerifyPageTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com");
        WebElement headingel = driver.findElement(By.xpath("//h1[contains(text(),'Happening')]"));
        String expectedHeading = "Happening now.";
        String actualHeading = headingel.getText();
        Assert.assertEquals(expectedHeading,actualHeading,"Twitter page title does not match");
        driver.quit();
    }
}
