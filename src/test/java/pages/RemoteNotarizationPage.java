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



    public void Enter_RemoteNotarizationPage(){
        enterRemoteNotarization.click(); }

    public void enterNotorization_Now() {
        NotarizationNow.click(); }

    public void enterRemoteNotorization() {
        Notarization_Schedule.click(); }
}
