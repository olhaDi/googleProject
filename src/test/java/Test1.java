import org.testng.annotations.Test;
import pages.HomePage;

public class Test1 extends BaseTest {
    HomePage homePage;
    String baseUrl = "https://www.google.com/";

    @Test
    public void verifySearchField() {

        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.clickSearchField();
        homePage.enterDataToSearchField("String 1");
    }

    @Test
    public void verifyPoshukGoogleButtonEnabled() {

        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.verifyPoshukGoogleButtonEnabled();
    }
}
