package OR;

import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUI extends BaseClass {

    public LoginUI() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Agile Project')]")
    public WebElement LblAgileproject;

    @FindBy(how = How.XPATH,using = "//input[@name='uid']")
    public WebElement TxtBoxUserId;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public WebElement TxtBoxUserPswd;

    @FindBy(how = How.XPATH,using = "//input[@name='btnLogin']")
    public WebElement BtnLoginAGPR;

    @FindBy(how = How.XPATH,using = "//marquee[@class='heading3']")
    public WebElement LblCustomerBankHome;

    @FindBy(how = How.XPATH,using = "//a[text()='Log out']")
    public WebElement BtnLogOutHome;

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Mini Statement')]")
    public WebElement BtnMiniStatementHome;

    @FindBy(how = How.XPATH,using = "//select[@name='accountno']")
    public WebElement BtnStatementNum;

    public String DWMinistatement = new StringBuilder("//select//option[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH,using = "//input[@type='submit']")
    public WebElement BtnSubmitMSF;

    public String LblSelectedStNum = new StringBuilder("//p[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Continue')]")
    public WebElement BtnContinueMSF;

    public String BtnGuruTab = new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH,using = "//h1[contains(text(),'Add Customer')]")
    public WebElement LblAddCustomer;

    @FindBy(how = How.XPATH,using = "//input[@id='pending']//following::label[@for='pending']")
    public WebElement BtnRadPendingAddCust;

    @FindBy(how = How.XPATH,using = "//input[@name='fname']")
    public WebElement TxtFnameAddCust;

    @FindBy(how = How.XPATH,using = "//input[@name='lname']")
    public WebElement TxtLnameAddCust;

    @FindBy(how = How.XPATH,using = "//input[@name='emailid']")
    public WebElement TxtEmailAddCust;

    @FindBy(how = How.XPATH,using = "//textarea[@name='addr']")
    public WebElement TxtAddressAddCust;

    @FindBy(how = How.XPATH,using = "//input[@name='telephoneno']")
    public WebElement TxtPhoneNumAddCust;

    @FindBy(how = How.XPATH,using = "//input[@value='Submit']")
    public WebElement BtnSubmitAddCust;

    @FindBy(how = How.XPATH,using = "//td[@align='center']//h3")
    public WebElement LblAddedCustAddCust;

    @FindBy(how = How.XPATH,using = "//a[@class='button' and contains(text(),'Home')]")
    public WebElement BtnHomeAddCust;

    @FindBy(how = How.XPATH,using = "//h3//a[contains(text(),'Pay Billing')]")
    public WebElement BtnPayBillingTelecomPage;

    @FindBy(how = How.XPATH,using = "//input[@name='customer_id']")
    public WebElement TxtEnterCustIDPayBill;

    @FindBy(how = How.XPATH,using = "//input[@value='submit']")
    public WebElement BtnSubmitPayBill;

    @FindBy(how = How.XPATH,using = "//h1[contains(text(),'Pay Billing')]//following::h3")
    public WebElement LblAddedCustPayBill;

}

