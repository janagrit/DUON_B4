package tests;

import com.sun.webkit.WebPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.IconsPage;
import pages.RemoteNotarizationPage;

public class Icon_Downloads_Test extends TestBase{

//    @BeforeMethod(alwaysRun = true)
//    public void enter(){
//        RemoteNotarizationPage rn = new RemoteNotarizationPage();
//        rn.Enter_RemoteNotarizationPage();
//    }

    @Test
    public void EnterIcons(){
        logger.info("Verifying transfer to the next needed link-page");
        IconsPage iconPage = new IconsPage();
        iconPage.YouTubeIcon.click();
//        iconPage.facebookIcon.click();
//        iconPage.TwitterIcon.click();
//        iconPage.instagramIcon.click();
       // System.out.println(driver.getPageSource());


        String youTube = "DuoNotary - YouTube";
        Assert.assertTrue(driver.getTitle().contains(youTube));


    }


}
