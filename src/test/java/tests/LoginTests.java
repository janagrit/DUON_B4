package tests;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase{


    @Test (groups = "smoke", alwaysRun = true)
    public void positiveLogin() throws InterruptedException {
        // 1. login in:
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Thread.sleep(10000);

        // Verify that the login was successful
        String expectedURL = "http://70.32.24.165/client/main-page";
        assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test (groups = "smoke", alwaysRun = true)
    public void negativeLogin(){
        // 2. login in with wrong credentials:

        LoginPage loginPage = new LoginPage();
        loginPage.Negativelogin();

        // Verify that the login was Unsuccessful
        String expectedMessage = "Username or password error";
        assertTrue(loginPage.errorMessage.isDisplayed());
        assertEquals(loginPage.errorMessage.getText(), expectedMessage);


    }












}