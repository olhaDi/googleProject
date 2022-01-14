package pages;

import elements.HomePageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
    WebDriver driver;
    HomePageElements elements;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
        elements = new HomePageElements(driver);
    }

    public void clickRegisterButton(){
        elements.registerButton.click();
    }

    public void clickWhereAreYouGoingSearchField(){
        elements.whereAreYouGoingSearchField.click();
    }

    public boolean verifySuggestedDestinationsTableIsVisible(){
        highlightElement(elements.suggestedDestinationsTableVisible);
        return elements.suggestedDestinationsTableVisible.isDisplayed();
    }

    public void enterDestination(String destination){
        elements.whereAreYouGoingSearchField.sendKeys(destination);
        elements.whereAreYouGoingSearchField.sendKeys(Keys.ENTER);
    }

    public void verifyTextOnCheckboxIamTravelingForWork(String expectedText){
        String actual=elements.iAmTravelingForWorkCheckboxLabel.getText();
        Assert.assertTrue(actual.contentEquals(expectedText));
    }

    public void verifyIamTravelingForWorkCheckboxIsUnchecked(){
        boolean actual = elements.iAmTravelingForWorkCheckbox.isSelected();
        Assert.assertFalse(actual);
    }
}
