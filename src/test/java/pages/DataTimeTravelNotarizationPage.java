package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTimeTravelNotarizationPage {


    public DataTimeTravelNotarizationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='date-col-disable times text-dark col-md-2'][5]")
    public WebElement lastDate;

    @FindBy(xpath = "//*[.='10:00 AM']")
    public WebElement available10am;

    @FindBy (xpath = "//button[@type='btn']")
    public WebElement backButton;

    @FindBy (xpath = "//button[@class = 'btn myBtn nextColor']")
    public WebElement nextButton;

    @FindBy(xpath = "//*[.='Select Date']")
    public WebElement selectDateTitle;






    public void clickBackButton() {
        backButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }


}
