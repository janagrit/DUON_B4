package tests;

import org.openqa.selenium.WebElement;
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
        rn.enterRemoteNotorization();
    }



//    @Test
//    public void Notary_Public(){
//        // 4. ----- (Jira ticket 4)
//
//    }
//
//    @Test
//    public void I_9Verification(){
//        // 5. ---- (Jira ticket 5)
//
//    }
//
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
