package pages;

import elements.HomePageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    HomePageElements elements;

    public HomePage(WebDriver driver){
        this.driver=driver;
        elements = new HomePageElements(driver);
    }

    public void clickSearchField(){
        elements.searchField.click();
    }

    public void enterDataToSearchField(String query){
        elements.searchField.sendKeys(query);
        elements.searchField.sendKeys(Keys.ENTER);
    }

    public void verifyPoshukGoogleButtonEnabled(){
        Assert.assertTrue(elements.poshukGoogleButton.isEnabled());
    }

    public void verifyLogoDisplayed(){
        Assert.assertTrue(elements.logo.isDisplayed());
    }
}
