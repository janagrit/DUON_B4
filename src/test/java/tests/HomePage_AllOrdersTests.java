package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



    public class HomePage_AllOrdersTests extends TestBase{

//        @BeforeMethod(alwaysRun = true)
//        public void login(){
////            LoginPage loginPage = new LoginPage();
////            loginPage.login();
//        }

        @Test
        public void verifyPositiveRegistration_Message() {
            // 1. Login msg
        String msg1 = "Congratulations! Your registration is almost complete, " +
                "please verify your email by clicking the link we emailed you.";

        }


        @Test
        public void negativeRegistration_Msg(){
            // 1.1. Failed login
            String msg2 = "";
        }


        @Test
        public void verifyClock() {
            // 1. Time on the page

        }

        @Test (groups = "smoke")
        public void verifyContent_Text() {
            // 2. correct text
        String text = "Notarize documents online or in person at your convenient\n" +
                "time and location";


        }

        @Test (groups = "smoke")
        public void verifyContent_Text_Why_DuoNotary() {
            // 2.1. correct text
            String text1 = "Legal services at your door";
            String text2 = "All notary services (domestic & international)";
            String text3 = "Same day services";
            String text4 = "Affordable prices";

        }



        @Test
        public void verifyCheckButtons_Download_mobile_app() {
            // 3. Click on the active links and verify the transfer to correct page

        }
}
