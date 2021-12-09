package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageElements {
    WebDriver driver;

//    @FindBy(xpath = "//input[@name='q']")
//    public WebElement searchField;
//
//    @FindBy(xpath = "/html/body//form[@role='search']//div[@class='A8SBwf']/div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")
//    public WebElement poshukGoogleButton;
//
//    @FindBy(xpath="//picture//img[@id='hplogo']")
//    public WebElement logo;

    public BasePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
