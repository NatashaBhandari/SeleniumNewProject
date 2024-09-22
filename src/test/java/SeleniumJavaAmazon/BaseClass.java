package SeleniumJavaAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    WebDriver driver;

    @BeforeTest
    public void lauchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String urlToLaunch = Utils.getValue("url");
        driver.get(urlToLaunch);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
