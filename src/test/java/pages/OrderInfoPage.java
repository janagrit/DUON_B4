package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderInfoPage {


    public OrderInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@type='btn']")
    public WebElement backButton;

    @FindBy (xpath = "//button[@class = 'btn myBtn nextColor']")
    public WebElement nextButton;

    @FindBy (xpath = "//input[@id='zip-code-input']")
    public WebElement addressField;

    @FindBy (xpath = "//li[@class='address-li']")
    public WebElement hiddenAddressField;

    @FindBy (xpath = "//p[@color='warning']")
    public WebElement errorMessage;

    @FindBy (xpath = "//div[@class='Toastify__toast Toastify__toast--warning']")
    public WebElement errorMessage1;

    @FindBy (xpath = "//div[@class='TitleOfOrder2'][.='Apostille Service']")
    public WebElement apostilleService;

    @FindBy (xpath = "//div[@class='priceTitle'][.='250.00$']")
    public WebElement apostillePrice250;

    @FindBy (xpath = "//div[.='Real Estate & Refinance'][@class='TitleOfOrder2']")
    public WebElement realEstateAndRefinance;

    @FindBy (xpath = "//div[.='175.00$'][@class='priceTitle']")
    public WebElement realEstateAndRefinancePrice175;

    @FindBy (xpath = "//div[.='Notary Public'][@class='TitleOfOrder2']")
    public WebElement notaryPublic;

    @FindBy (xpath = "//div[.='49.00$'][@class='priceTitle']")
    public WebElement notaryPublicPrice49;

    @FindBy(xpath = "//div[.='I-9 Verification'][@class='TitleOfOrder2']")
    public WebElement i9Verification;

    @FindBy (xpath = "//div[.='95.00$'][@class='priceTitle']")
    public WebElement i9VerificationPrice95;

    @FindBy (xpath = "//div[.='Embassy Legalization '][@class='TitleOfOrder2']")
    public WebElement emabassyLegalization;

    @FindBy (xpath = "//div[.='450.00$'][@class='priceTitle']")
    public WebElement emabassyLegalizationPrice450;

    @FindBy (xpath = "//div[.='Select our service'][@class='TitleOfOrder2']")
    public WebElement text1;




    public void clickBackButton() {
        backButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

}
