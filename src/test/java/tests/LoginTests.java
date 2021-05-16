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
    public void positiveLogin(){
        // 1. login in:
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Test (groups = "smoke", alwaysRun = true)
    public void negativeLogin(){
        // 2. login in with wrong credentials:
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }












}