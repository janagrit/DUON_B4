package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IconsPage {



    public IconsPage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }


    @FindBy(xpath = "//span [contains(text(), 'Google play' )]")
    public WebElement GooglePlay;

    @FindBy(xpath = "//span [contains(text(), 'App store' )]")
    public WebElement AppStore;

    @FindBy(xpath = "//a[@class='fab fa-youtube']")
    public WebElement YouTubeIcon;


    @FindBy(xpath = "//a[@class='fab fa-twitter']")
    public WebElement TwitterIcon;

    @FindBy(xpath = "//a[@class='fab fa-instagram']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//a[@class='fab fa-facebook']")
    public WebElement facebookIcon;

    public void EnterYutubeMethod(){

        YouTubeIcon.click();
    }


}
