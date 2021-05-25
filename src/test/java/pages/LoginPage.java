package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {



    // PAGE OBJECT MODEL
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Page classes can contain variables and methods that deal with actions on the UI

    @FindBy(xpath = "//div[@class='menuBlock']")
    public WebElement menuButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//div[@class='labelBlockModal']")
    public WebElement keepMeLogInButton;

    @FindBy(xpath = "//button[@class='borRad']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button [contains(text(), 'Accept')]")
    public WebElement CautionMessage;




    public void login(){
//        menuButton.click();
//        userName.sendKeys("janagrit@gmail.com");
//        password.sendKeys("Abcde1234");
//        keepMeLogInButton.click();
//        loginButton.click();

        BrowserUtilities.jsClick(menuButton);
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        BrowserUtilities.jsClick(keepMeLogInButton);
        BrowserUtilities.jsClick(loginButton);



    }

    public void Negativelogin(){
        BrowserUtilities.jsClick(CautionMessage);
        BrowserUtilities.jsClick(menuButton);
        userName.sendKeys("janagkrit@gmail.com");
        password.sendKeys("Abcdel1234");
        keepMeLogInButton.click();
        BrowserUtilities.jsClick(loginButton);


//        BrowserUtilities.jsClick(menuButton);
//        userName.sendKeys(ConfigReader.getProperty("iana@gmail.com"));
//        password.sendKeys(ConfigReader.getProperty("hioooooooooo"));
//        BrowserUtilities.jsClick(keepMeLogInButton);
//        BrowserUtilities.jsClick(loginButton);



    }




}
