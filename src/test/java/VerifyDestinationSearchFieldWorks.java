import org.testng.annotations.Test;
import pages.HomePage;

public class VerifyDestinationSearchFieldWorks extends BaseTest {
    HomePage homePage;
    String baseUrl = "https://www.booking.com/";

    @Test
    public void verifyDestinationSearchFieldWorks() {

        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.clickWhereAreYouGoingSearchField();
        homePage.enterDestination("United States of America");
    }

}
