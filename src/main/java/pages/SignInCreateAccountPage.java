package pages;

import elements.HomePageElements;
import elements.SignInCreateAccountPageElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInCreateAccountPage extends BasePage {
    WebDriver driver;
    SignInCreateAccountPageElements elements;

    public SignInCreateAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        elements = new SignInCreateAccountPageElements(driver);
    }

    public void verifyPageHeader(String expectedHeader) {
        String actual = elements.headerSignInCreateAccountPageElements.getText();
        Assert.assertTrue(actual.equalsIgnoreCase(expectedHeader));
    }
}

