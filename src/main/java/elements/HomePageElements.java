package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='bui-button__text' and contains(., 'Register')]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@type='search' and @data-sb-id='main']")
    public WebElement whereAreYouGoingSearchField;

    @FindBy(xpath = "//ul[@aria-label='List of suggested destinations ' and contains(@class,'visible') ]")
    public WebElement suggestedDestinationsTableVisible;

    @FindBy(xpath = "//input[@id='sb_travel_purpose_checkbox']")
    public WebElement iAmTravelingForWorkCheckbox;

    @FindBy(xpath = "//input[@id='sb_travel_purpose_checkbox']/parent::div/label")
    public WebElement iAmTravelingForWorkCheckboxLabel;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}