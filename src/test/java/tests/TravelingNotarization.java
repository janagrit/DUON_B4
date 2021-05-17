package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RemoteNotarizationPage;
import pages.TravelingNotarizationPage;

public class TravelingNotarization extends TestBase{

// zipcode bug ticket


    /*
    By entering zip code 22031 - you will receive suggested address -  Fairfax, VA 22031, USA
bug: the program asks to enter more detailed address .... If the user doesn't
know one ..... ????
-> 9739 Fairfax Blvd, Fairfax, VA 22031, USA
     */


    @BeforeMethod(alwaysRun = true)
    public void homepage() {
        TravelingNotarizationPage rn = new TravelingNotarizationPage();
        rn.enterTravelingNotarizationPage();
    }

    @Test
    public void verifyTN_Page(){
        Assert.assertTrue(driver.getTitle().contains("Traveling"));
    }


    }