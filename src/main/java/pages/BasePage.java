package pages;

import elements.BasePageElements;
import elements.HomePageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage {

    WebDriver driver;

    BasePageElements elements;

    public BasePage(WebDriver driver){
        this.driver=driver;
        elements = new BasePageElements(driver);
    }

    public void verifyPageHeader(String expectedHeader){
        String actual = this.driver.getTitle();
        Assert.assertTrue(actual.equalsIgnoreCase(expectedHeader));
    }


    public void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}
