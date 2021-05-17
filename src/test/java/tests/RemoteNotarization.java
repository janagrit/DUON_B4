package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RemoteNotarizationPage;

public class RemoteNotarization extends TestBase{


    @BeforeMethod (alwaysRun = true)
    public void enter(){
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.Enter_RemoteNotarizationPage();
    }


    @Test(groups = "smoke")
    public void Entering_Now_Page(){
        // 1. Entering Now Page of Remote Notarization (Jira ticket 2)
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.enterNotorization_Now();
    }

    @Test(groups = "smoke")
    public void Entering_Schedule_Page(){
        // 2. Entering Now Page of Remote Notarization (Jira ticket 2)
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.enterNotorization_Scheduled();
        Assert.assertTrue(driver.getTitle().equals("Online (remote) notary services - RON | DuoNotary"));
    }



    @Test
    public void Order_Info(){
        // 3. ----- (Jira ticket 4 = Price Issue on the amount 12)
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.enterNotorization_Scheduled();
        rn.titleDocMethod();
        rn.count_amountMethod();
        rn.uploadBottonMethod();
        rn.checkboxMethod();
        rn.nextButtonMethod();
    }

    @Test
    public void Data_Time_Section(){
        // 4. ---- (Jira ticket 5)
        Order_Info();

    }

//    @Test
//    public void Embassy_Legalization(){
//        // 6. --- (Jira ticket 6)
//
//    }
//
//    @Test
//    public void Data_Time(){
//        // 7. --- (Jira ticket 7)
//
//    }
//
//    @Test
//    public void User_info() {
//        // 8. ----(Jira ticket 8)
//    }
//
//    @Test
//    public void Payment () {
//        // 9. --- (Jira ticket 9)
//
//    }
}
