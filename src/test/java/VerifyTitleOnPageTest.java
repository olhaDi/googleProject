import org.testng.annotations.Test;
import pages.HomePage;

public class VerifyTitleOnPageTest extends BaseTest {
    HomePage homePage;
    String baseUrl = "https://www.booking.com/";

    @Test
    public void verifyPageHeader() {

        driver.get(baseUrl);
        homePage = new HomePage(driver);
//        homePage.verifyPageHeader("Booking.com | Official site | The best hotels & accommodations");
        System.out.println("VerifyTitleOnPageTest");
    }

}
