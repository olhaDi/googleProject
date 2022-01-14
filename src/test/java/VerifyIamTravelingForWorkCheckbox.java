import org.testng.annotations.Test;
import pages.HomePage;

public class VerifyIamTravelingForWorkCheckbox extends BaseTest {
    HomePage homePage;
    String baseUrl = "https://www.booking.com/";

    @Test
    public void verifyTextOnCheckbox(){
        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.verifyIamTravelingForWorkCheckboxIsUnchecked();
        homePage.verifyTextOnCheckboxIamTravelingForWork("I'm traveling for work");
    }

}