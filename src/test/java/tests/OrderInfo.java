package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OrderInfoPage;
import pages.TravelingNotarizationPage;

import java.util.concurrent.TimeUnit;

public class OrderInfo extends TestBase{


    @BeforeMethod(alwaysRun = true)
    public void homepage() {
        TravelingNotarizationPage rn = new TravelingNotarizationPage();
        rn.enterTravelingNotarizationPage();
    }

    @Test
    public void verifyTitle() {
        String expectedTitle = "Location for an appointment";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifySmallTitle() {
        String expectedTitle = "* Notary agent will arrive to this address";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifyAddressText() {
        String expectedTitle = "Address";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifyOrderInfoText() {
        String expectedTitle = "Order info";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifyDataTimeText() {
        String expectedTitle = "Data/Time";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifyUserInfoText() {
        String expectedTitle = "User info";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void verifyPaymentText() {
        String expectedTitle = "Payment";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
    }

    @Test
    public void backButtonClick() {
        OrderInfoPage orderInfo = new OrderInfoPage();
        orderInfo.clickBackButton();

    }

    @Test
    public void enterAddressPositiveTest() {
        OrderInfoPage oip = new OrderInfoPage();
        oip.addressField.sendKeys("11341 Crescent Dr, Fairfax, VA 22030, USA");
        oip.hiddenAddressField.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.clickNextButton();
    }

    @Test
    public void enterAddressNegativeTest() {
        OrderInfoPage oip = new OrderInfoPage();
        oip.addressField.sendKeys("20 W 34th St, New York, NY 10001");
        oip.hiddenAddressField.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.clickNextButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(oip.errorMessage1.isDisplayed());
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Assert.assertTrue(oip.errorMessage.isDisplayed());
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void verifyApostilleServiceTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.apostilleService.getText();
        String expected = "Apostille Service";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyRealEstateAndRefinanceTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.realEstateAndRefinance.getText();
        String expected = "Real Estate & Refinance";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyNotaryPublicTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.notaryPublic.getText();
        String expected = "Notary Public";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyI9VerificationTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.i9Verification.getText();
        String expected = "I-9 Verification";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyEmbassyLegalizationTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.emabassyLegalization.getText();
        String expected = "Embassy Legalization";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyApostilleServicePrice250() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.apostillePrice250.getText();
        String expected = "250.00$";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyRealEstateAndRefinancePrice175() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.realEstateAndRefinancePrice175.getText();
        String expected = "175.00$";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyNotaryPublicPrice49() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.notaryPublicPrice49.getText();
        String expected = "49.00$";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyI9VerificationPrice95() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.i9VerificationPrice95.getText();
        String expected = "95.00$";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyEmbassyLegalizationPrice450() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.emabassyLegalizationPrice450.getText();
        String expected = "450.00$";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyText1() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.text1.getText();
        String expected = "Select our service";
        Assert.assertEquals(actual, expected);
    }

//    @Test
//    public void verifyText2() {
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String expectedTitle = "* Notary Agent will arrive to your location to Notarize your documents";
//        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
//    }
}
