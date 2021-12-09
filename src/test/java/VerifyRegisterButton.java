import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInCreateAccountPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class VerifyRegisterButton extends BaseTest{
    HomePage homePage;
    SignInCreateAccountPage signInCreateAccountPage;
    String baseUrl="https://www.booking.com/";

    @Test
    public void verifyRegisterButton(){

//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);

//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("foo"));
//            }
//        });



        driver.get(baseUrl);
        homePage = new HomePage(driver);
        signInCreateAccountPage = new SignInCreateAccountPage(driver);
        homePage.clickRegisterButton();
//        driver.navigate().forward();
        signInCreateAccountPage.verifyPageHeader("Sign in or create an account");
    }

}
