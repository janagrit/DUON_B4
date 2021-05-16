package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TravelingNotarizationPage {

    public TravelingNotarizationPage( ){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h4[.='Traveling notarization']")
    public WebElement enterT_N;


    public void enterTN_Page(){
    enterT_N.click(); }


    }
