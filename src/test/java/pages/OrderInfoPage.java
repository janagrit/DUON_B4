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

    @FindBy (xpath = "//div[.='I-9 Verification'][@class='TitleOfOrder2']")
    public WebElement i9Verification;

    @FindBy (xpath = "//div[.='95.00$'][@class='priceTitle']")
    public WebElement i9VerificationPrice95;

    @FindBy (xpath = "//div[.='Embassy Legalization '][@class='TitleOfOrder2']")
    public WebElement emabassyLegalization;

    @FindBy (xpath = "//div[.='450.00$'][@class='priceTitle']")
    public WebElement emabassyLegalizationPrice450;

    @FindBy (xpath = "//div[.='Select our service'][@class='TitleOfOrder2']")
    public WebElement text1;

    @FindBy (xpath = "form-control h_input py-0")
    public WebElement apolstilleServiceSelectCountry;

    @FindBy (xpath = "//input[@class='form-control h_input']")
    public WebElement apolstilleServiceDocumentType;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[3]/div/div[2]/div/div[3]/i")
    public WebElement apolstilleServiceCountDocumentIncrease;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[3]/div/div[2]/div/div[1]/i")
    public WebElement apolstilleServiceCountDocumentDecrease;

    @FindBy(xpath = "//div[@class='col-md-6 d-flex align-items-center']//div[@class='count'][1]")
    public WebElement apostilleServiceCountDocuments;

    @FindBy(xpath = "//div[@class='labelBlockReal']")
    public WebElement apostilleServiceServiceRequestForSomeoneElse;

    @FindBy(xpath = "//input[@name='requesterFirstName']")
    public WebElement apostilleServiceRequesterFirstName;

    @FindBy(xpath = "//input[@name='requesterLastName']")
    public WebElement apostilleServiceRequesterLastName;

    @FindBy(xpath = "//input[@name='requesterPhoneNumber']")
    public WebElement apostilleServiceRequesterPhoneNumber;

    @FindBy(xpath = "//input[@name='requesterEmail']")
    public WebElement apostilleServiceRequesterEmail;

    @FindBy(xpath = "//input[@name='pickUpAddress']")
    public WebElement apostilleServicePickupAddress;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[12]/div/div[3]/i")
    public WebElement apostilleServicePrintingIncrese;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[12]/div/div[1]/i")
    public WebElement apostilleServicePrintingDecrease;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[14]/div/div[3]/i")
    public WebElement apostilleServiceDropOffIncrease;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/form/div/div[14]/div/div[1]/i")
    public WebElement apostilleServiceDropOffDecrease;

    @FindBy(xpath = "//select[@class='form-control h_input']")
    public WebElement getRealEstateAndRefinanceRequestorSelect;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/form/div/div[6]/div/div[3]/i")
    public WebElement getRealEstateAndRefinancePrintingIncrease;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/form/div/div[6]/div/div[1]/i")
    public WebElement getGetRealEstateAndRefinancePrintingDecrease;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/form/div/div[8]/div/div[3]/i")
    public WebElement getRealEstateAndRefinanceDropOffIncrease;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div/div[2]/div/form/div/div[8]/div/div[1]/i")
    public WebElement getRealEstateAndRefinanceDropOffDecrease;




    public void clickBackButton() {
        backButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }





}
