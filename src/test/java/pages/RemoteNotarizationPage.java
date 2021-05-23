package pages;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RemoteNotarizationPage {


    public RemoteNotarizationPage( ){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='/online']//h4")
    public WebElement enterRemoteNotarization;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/remote-notarization.png\") center center no-repeat;']")
    public WebElement NotarizationNow;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/traveling-notarization.png\") center center no-repeat;']")
    public WebElement Notarization_Schedule;

    @FindBy(id = "titleDoc")
    public WebElement titleDoc;

    @FindBy(xpath = "//div[@class='count']")
    public WebElement count_amount;

    @FindBy(id = "documentOnline")
    public WebElement uploadBotton;

    @FindBy(id = "defaultUnchecked")
    public WebElement checkbox;

    @FindBy(xpath = "//button[contains(text(), 'Next' )]")
    public WebElement nextButton;






    public void nextButtonMethod(){
        nextButton.click();}

    public void checkboxMethod(){
        if(! checkbox.isSelected() )
        checkbox.isSelected(); }

    public void uploadBottonMethod(){
        uploadBotton.sendKeys("/Users/ianagrytsenko/Documents/cover.doc"); }

    public void titleDocMethod(){
        titleDoc.sendKeys("test title"); }

    public void count_amountMethod(){
        count_amount.click();
    }

    public void Enter_RemoteNotarizationPage(){
        enterRemoteNotarization.click(); }

    public void enterNotorization_Now() {
        NotarizationNow.click(); }

    public void enterNotorization_Scheduled() {
        Notarization_Schedule.click(); }
}
