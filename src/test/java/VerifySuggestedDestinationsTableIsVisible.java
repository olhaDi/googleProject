import org.testng.annotations.Test;
import pages.HomePage;

public class VerifySuggestedDestinationsTableIsVisible extends BaseTest{
    HomePage homePage;
    String baseUrl="https://www.booking.com/";

    @Test
    public void verifySuggestedDestinationsTableIsVisible(){

        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.clickWhereAreYouGoingSearchField();
        homePage.verifySuggestedDestinationsTableIsVisible();
        System.out.println("verifySuggestedDestinationsTableIsVisible");
    }

}
