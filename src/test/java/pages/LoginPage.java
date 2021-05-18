package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy(id = "u44diff8yz")
    public WebElement errorMessage;



    public void login(){
//        menuButton.click();
//        userName.sendKeys("janagrit@gmail.com");
//        password.sendKeys("Abcde1234");
//        keepMeLogInButton.click();
//        loginButton.click();

        menuButton.click();
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        keepMeLogInButton.click();
        loginButton.click();

    }




}
