package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInCreateAccountPageElements {
    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement headerSignInCreateAccountPageElements;

    public SignInCreateAccountPageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
