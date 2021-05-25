package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DataTimeTravelNotarizationPage;
import pages.OrderInfoPage;
import pages.TravelingNotarizationPage;
import sun.rmi.runtime.NewThreadAction;

import java.util.concurrent.TimeUnit;

public class OrderInfo extends TestBase{

    @BeforeMethod(alwaysRun = true)
    public void homepage() {
        TravelingNotarizationPage rn = new TravelingNotarizationPage();
        rn.enterTravelingNotarizationPage();
    }

    @Test
    public void verifyTitle() {
        logger.info("Verifying that Order Info page contains title Location For An Appointment");
        String expectedTitle = "Location for an appointment";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title Location For An Appointment is located on the Order Info page");
    }

    @Test
    public void verifySmallTitle() {
        logger.info("Verifying that Order Info page contains title * Notary Agent Will Arrive To This Address");
        String expectedTitle = "* Notary agent will arrive to this address";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title * Notary Agent Will Arrive To This Address is located on the Order Info page");
    }

    @Test
    public void verifyAddressText() {
        logger.info("Verifying that Order Info page contains title Address");
        String expectedTitle = "Address";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title Address is located on the Order Info page");
    }

    @Test
    public void verifyOrderInfoText() {
        logger.info("Verifying that Order Info page contains title Order info");
        String expectedTitle = "Order info";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title Order info is located on the Order Info page");
    }

    @Test
    public void verifyDataTimeText() {
        logger.info("Verifying that Data/Time page contains title Order info");
        String expectedTitle = "Data/Time";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title Data/Time is located on the Order Info page");
    }

    @Test
    public void verifyUserInfoText() {
        logger.info("Verifying that User info page contains title Order info");
        String expectedTitle = "User info";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title User info is located on the Order Info page");
    }

    @Test
    public void verifyPaymentText() {
        logger.info("Verifying that Payment page contains title Order info");
        String expectedTitle = "Payment";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
        logger.pass("Title Payment is located on the Order Info page");
    }

    @Test
    public void backButtonClick() {
        logger.info("Verifying that Back button on Order info is functional");
        OrderInfoPage orderInfo = new OrderInfoPage();
        orderInfo.clickBackButton();
        logger.pass("Back button on Order info is functional");
    }

    @Test
    public void enterAddressPositiveTest() {
        OrderInfoPage oip = new OrderInfoPage();
        logger.info("Verifying that address field on Order Info page excepts valid address");
        oip.addressField.sendKeys("11341 Crescent Dr, Fairfax, VA 22030, USA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.hiddenAddressField.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.clickNextButton();
        logger.pass("Address field on Order Info page excepts valid address");
    }


    @Test
    public void enterAddressNegativeTest() {
        logger.info("Verifying that address field on Order Info page doesn't except valid address");
        OrderInfoPage oip = new OrderInfoPage();
        oip.addressField.sendKeys("20 W 34th St, New York, NY 10001");
        oip.hiddenAddressField.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.clickNextButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(oip.errorMessage1.isDisplayed());

        logger.pass("Address field on Order Info page doesn't except valid address");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Assert.assertTrue(oip.errorMessage.isDisplayed());
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.pass("Order Info page doesn't except valid address");
    }

    @Test
    public void verifyApostilleServiceTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        logger.info("Verifying that title Apostille Services is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.apostilleService.getText();
        String expected = "Apostille Service";
        logger.pass("title Apostille Services is on Order Info page");
    }

    @Test
    public void verifyRealEstateAndRefinanceTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Verifying that title Real Estate & Refinance is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.realEstateAndRefinance.getText();
        String expected = "Real Estate & Refinance";
        Assert.assertEquals(actual, expected);
        logger.pass("title Real Estate & Refinance is on Order Info page");
    }

    @Test
    public void verifyNotaryPublicTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Verifying that title Notary Public is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.notaryPublic.getText();
        String expected = "Notary Public";
        Assert.assertEquals(actual, expected);
        logger.pass("title Notary Public is on Order Info page");
    }

    @Test
    public void verifyI9VerificationTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Verifying that title I-9 Verification is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.i9Verification.getText();
        String expected = "I-9 Verification";
        Assert.assertEquals(actual, expected);
        logger.pass("title I-9 Verification is on Order Info page");
    }

    @Test
    public void verifyEmbassyLegalizationTitle() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Verifying that title Embassy Legalization is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.emabassyLegalization.getText();
        String expected = "Embassy Legalization";
        Assert.assertEquals(actual, expected);
        logger.pass("title Embassy Legalization is on Order Info page");
    }

    @Test
    public void verifyApostilleServicePrice250() {
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Verifying that value 250.00$ is on Order Info page");
        OrderInfoPage oip = new OrderInfoPage();
        String actual = oip.apostillePrice250.getText();
        String expected = "250.00$";
        Assert.assertEquals(actual, expected);
        logger.pass("value 250.00$ is on Order Info page");
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

    @Test
    public void apostilleServiceFormTest1(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

//        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

        oip.apolstilleServiceCountDocumentIncrease.click();
        oip.apolstilleServiceCountDocumentIncrease.click();
        oip.apolstilleServiceCountDocumentIncrease.click();
        oip.apolstilleServiceCountDocumentIncrease.click();
        oip.apolstilleServiceCountDocumentIncrease.click();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();

        String expectedCount = "3";

        String actualCount = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        oip.clickNextButton();
    }

    @Test
    public void apostilleServiceFormTest2(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedCount = "5";

        String actualCount = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount, expectedCount);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();

        String expectedCount1 = "3";

        String actualCount1 = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount1, expectedCount1);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        oip.clickNextButton();
    }

    @Test
    public void apostilleServiceFormTest3(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        String expectedCount = "5";
//
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//
//        Assert.assertEquals(actualCount, expectedCount);

        String expectedTotal = "250.00";

        Assert.assertTrue(driver.getPageSource().contains(expectedTotal));


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();

        String expectedCount1 = "3";

        String actualCount1 = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount1, expectedCount1);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        oip.clickNextButton();
    }

    @Test
    public void apostilleServiceFormTest4(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedCount = "5";

        String actualCount = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount, expectedCount);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();

        String expectedCount1 = "3";

        String actualCount1 = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount1, expectedCount1);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        oip.clickNextButton();
    }


    @Test
    public void apostilleServiceFormTest5(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        String expectedCount = "5";
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//        Assert.assertEquals(actualCount, expectedCount);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        oip.apolstilleServiceCountDocumentDecrease.click();

        String expectedCount1 = "0";

        String actualCount1 = oip.apostilleServiceCountDocuments.getText();

        Assert.assertEquals(actualCount1, expectedCount1);

        String expectedTotal = "250.00";

        Assert.assertTrue(driver.getPageSource().contains(expectedTotal));

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        oip.clickNextButton();
    }

    @Test
    public void apostilleServiceFormTest6(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//
//        String expectedCount = "3";
//
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//
//        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal1 = "253.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal1));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServicePrintingDecrease.click();
        oip.apostilleServicePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal2 = "251.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal2));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal3 = "551.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal3));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal4 = "426.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal4));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedCount = "0";

        String actualCount = oip.apostilleServiceCountDocuments.getText();
        Assert.assertEquals(actualCount, expectedCount);

        oip.clickNextButton();
    }

    @Test
    public void apostilleServiceFormTest7(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//
//        String expectedCount = "3";
//
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//
//        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal1 = "253.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal1));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServicePrintingDecrease.click();
        oip.apostilleServicePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal2 = "251.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal2));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal3 = "551.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal3));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal4 = "426.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal4));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        String expectedCount = "0";
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServicePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedCount = "0";
        String actualCount = oip.apostilleServiceCountDocuments.getText();
        Assert.assertEquals(actualCount, expectedCount);

        String expectedTotal5 = "250.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal4));

        oip.clickNextButton();
    }


    @Test
    public void apostilleServiceFormTest8(){
        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.apostilleService.click();

////        new Select(oip.apolstilleServiceSelectCountry).selectByVisibleText("Select country");
//        new Select(oip.apolstilleServiceSelectCountry).selectByValue("0");

        oip.apolstilleServiceDocumentType.sendKeys("Diploma");

//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//        oip.apolstilleServiceCountDocumentIncrease.click();
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        oip.apolstilleServiceCountDocumentDecrease.click();
//
//        String expectedCount = "3";
//
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//
//        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServiceServiceRequestForSomeoneElse.click();

        oip.apostilleServiceRequesterFirstName.sendKeys("Harry");
        oip.apostilleServiceRequesterLastName.sendKeys("Potter");
        oip.apostilleServiceRequesterPhoneNumber.sendKeys("1112223333");
        oip.apostilleServiceRequesterEmail.sendKeys("harry.potter@hogwarts.com");
        oip.apostilleServicePickupAddress.sendKeys("4 Privet Drive");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();
        oip.apostilleServicePrintingIncrese.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal1 = "253.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal1));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServicePrintingDecrease.click();
        oip.apostilleServicePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal2 = "251.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal2));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();
        oip.apostilleServiceDropOffIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal3 = "551.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal3));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal4 = "426.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal4));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        String expectedCount = "0";
//        String actualCount = oip.apostilleServiceCountDocuments.getText();
//        Assert.assertEquals(actualCount, expectedCount);

        oip.apostilleServicePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();
        oip.apostilleServiceDropOffDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.apolstilleServiceCountDocumentDecrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedCount = "0";
        String actualCount = oip.apostilleServiceCountDocuments.getText();
        Assert.assertEquals(actualCount, expectedCount);

        oip.apolstilleServiceCountDocumentIncrease.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal5 = "250.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal4));

        oip.clickNextButton();
    }
    /////////////////////////////////////////////////////////////////////////////



    @Test
    public void realEstateAndRefinanceTestHomeBuyerAndSeller() {

        enterAddressPositiveTest();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OrderInfoPage oip = new OrderInfoPage();
        oip.realEstateAndRefinance.click();

        new Select(oip.getRealEstateAndRefinanceRequestorSelect).selectByVisibleText("Home buyer/seller");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        new Select(oip.getRealEstateAndRefinanceRequestorSelect).selectByVisibleText("Title & Escrow Company");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        new Select(oip.getRealEstateAndRefinanceRequestorSelect).selectByVisibleText("Loan/Mortgage Company");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        new Select(oip.getRealEstateAndRefinanceRequestorSelect).selectByVisibleText("Real Estate Agency");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();
        oip.getRealEstateAndRefinancePrintingIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal1 = "300.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal1));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal2 = "250.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal2));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();
        oip.getRealEstateAndRefinanceDropOffIncrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTotal5 = "500.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal5));

        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();
        oip.getGetRealEstateAndRefinancePrintingDecrease.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        String expectedTotal6 = "425.00";
        Assert.assertTrue(driver.getPageSource().contains(expectedTotal6));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        oip.clickNextButton();

        String expectedTitle = "Select Date";
        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));

    }

//
//    @Test
//    public void realEstateAndRefinanaceClick(){
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        OrderInfoPage oip = new OrderInfoPage();
//        oip.realEstateAndRefinance.click();
//    }
//
//    @Test
//    public void notaryPublicClick(){
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        OrderInfoPage oip = new OrderInfoPage();
//        oip.notaryPublic.click();
//    }
//
//    @Test
//    public void i9VerificationClick(){
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        OrderInfoPage oip = new OrderInfoPage();
//        oip.i9Verification.click();
//    }
//
//    @Test
//    public void emabassyLegalizationClick(){
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        OrderInfoPage oip = new OrderInfoPage();
//        oip.emabassyLegalization.click();
//    }
//
//





//    @Test
//    public void verifyText2() {
//        enterAddressPositiveTest();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String expectedTitle = "* Notary Agent will arrive to your location to Notarize your documents";
//        Assert.assertTrue(driver.getPageSource().contains(expectedTitle));
//    }


}
