package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.DataTimeTravelNotarizationPage;
import pages.TravelingNotarizationPage;

import java.util.concurrent.TimeUnit;

public class DataTimeTravelNotarization extends TestBase {

    @BeforeMethod(alwaysRun = true)
    public void homepage() {
        TravelingNotarizationPage rn = new TravelingNotarizationPage();
        rn.enterTravelingNotarizationPage();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }

    @Test
    public void selectDataTimeTest() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.realEstateAndRefinanceTestHomeBuyerAndSeller();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        DataTimeTravelNotarizationPage datetime = new DataTimeTravelNotarizationPage();

        datetime.lastDate.click();

        datetime.available10am.click();

        datetime.clickNextButton();

    }

}
