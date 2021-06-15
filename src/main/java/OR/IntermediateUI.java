package OR;


import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IntermediateUI extends BaseClass {

    public IntermediateUI() {
        PageFactory.initElements(getDriver(), this);
    }

// Input Form Submit
    @FindBy(how = How.XPATH,using = "//a [@class='dropdown-toggle'][contains(.,'Input Forms')]")
    public WebElement DDInputFormHomePage;

    public String ValInputFormHomePage = new StringBuilder("//ul[@class='dropdown-menu']//a[contains(.,'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH,using = "//input[@name='first_name']")
    public WebElement TxtBoxFirstnameIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='last_name']")
    public WebElement TxtBoxLastnameIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='email']")
    public WebElement TxtBoxEmailIdIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='phone']")
    public WebElement TxtBoxPhoneIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='address']")
    public WebElement TxtBoxAddressIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='city']")
    public WebElement TxtBoxCityIFS;

    @FindBy(how = How.XPATH,using = "//select[@name='state']")
    public WebElement TxtBoxStateIFS;

    @FindBy(how = How.XPATH,using = "//input[@name='zip']")
    public WebElement TxtBoxZipCodeIFS;

    @FindBy(how = How.XPATH,using = "//textarea[@class='form-control']")
    public WebElement TxtBoxProjectDescriptionIFS;

    @FindBy(how = How.XPATH,using = "//div[@class='col-md-4']//button[@type='submit']")
    public WebElement BtnSendIFS;

    public String VerifyTickIFS = "//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok']" ;

    public String VerifySendIFS = "//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-ok']" ;

    //Ajax Form Submit
    @FindBy(how = How.XPATH,using = "//input[@name='btn-submit']")
    public WebElement BtnSubmitAFS;

    @FindBy(how = How.XPATH,using = "//span[@class='title-validation validation-error']")
    public WebElement LblMaditoryStarAFS;

    @FindBy(how = How.XPATH,using = "//input[@type='text']")
    public WebElement TxtBoxNameAFS;

    @FindBy(how = How.XPATH,using = "//textarea[@name='description']")
    public WebElement TxtBoxCommentAFS;

    @FindBy(how = How.XPATH,using = "//div[.='Form submited Successfully!']")
    public WebElement LblSubmitedSuccessfulAFS;



}

