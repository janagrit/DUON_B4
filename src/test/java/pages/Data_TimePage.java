package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.RemoteNotarization;
import utilities.ConfigReader;
import utilities.Driver;

public class Data_TimePage extends RemoteNotarizationPage  {


    public  Data_TimePage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }


    @FindBy(xpath = "//div [contains(text(), '26-May, 2021' )]")
    public WebElement Data;

    @FindBy(xpath = "//a [contains(text(), 'Sign in' )]")
    public WebElement SignInButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='borRad']")
    public WebElement buttonNext;

    public void login(){
        SignInButton.click();
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        buttonNext.click();

    }



//    @FindBy (xpath = "//div[@class='date-col times col-md-2']")
//    public WebElement Time;




}



