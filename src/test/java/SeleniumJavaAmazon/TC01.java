package SeleniumJavaAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends BaseClass {

    @Test()
    public void test1() {
        System.out.println(" browser luanched");
        WebElement webElement = driver.findElement(By.name("field-keywords"));
        if (webElement.isDisplayed()) {
            Assert.assertTrue(webElement.isDisplayed(), "Search Box is  displayed");
            webElement.sendKeys("Gucchi bags", Keys.ENTER);
        }
    }
}
