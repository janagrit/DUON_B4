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
    public WebElement travelingNotarizationClick;


    public void enterTravelingNotarizationPage(){
        travelingNotarizationClick.click();
    }


    public static class OrderInfoPage {
    }
}
