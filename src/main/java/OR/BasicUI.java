package OR;

import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasicUI extends BaseClass {

    public BasicUI()
    {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Selenium Easy')]")
    public WebElement LblSeleniumEasy;


    @FindBy(how = How.XPATH,using = "//a[@class='at4-close']")
    public WebElement LearnSeleniumPopup;

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Demo Home')]")
    public WebElement BtnDemoHomeSE;

    @FindBy(how = How.XPATH,using = "//h3[contains(text(),'Welcome to Selenium Easy ')]")
    public WebElement LblWlCumDemoSE;

    @FindBy(how = How.XPATH,using = "//a[@id='btn_basic_example']")
    public WebElement BtnStartPracticeSE;

    public String BasicPageOptions = new StringBuilder("//div[@class='list-group']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Please enter your Message']")
    public WebElement TxtBoxEnterMessageSimpleInputDH;

    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Show Message')]")
    public WebElement BtnShowMessageSimpleInputDH;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Your Message: ')]/following::span[@id='display']")
    public WebElement LblYourMessageSimpleInputDH;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Enter a')]/following::input[@id='sum1']")
    public WebElement TxtBoxEnteraTwoInputDH;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Enter a')]/following::input[@id='sum2']")
    public WebElement TxtBoxEnterbTwoInputDH;

    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Get Total')]")
    public WebElement BtnGetTotalTwoInputDH;

    @FindBy(how = How.XPATH,using = "//label[contains(text(),'Your Message: ')]/following::span[@id='displayvalue']")
    public WebElement LblTotalTwoInputDH;

    //ChecK Box Demo

    @FindBy(how = How.XPATH,using = "//input[@id='isAgeSelected']")
    public WebElement BtnClickCheckBoxSCD;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Success - Check box is checked')]")
    public WebElement LblSuccessSCD;

    @FindBy(how = How.XPATH,using = "//input[@value='Check All']")
    public WebElement BtnCheckAllMCD;

    @FindBy(how = How.XPATH,using = "//input[@value='UnCheck All']")
    public WebElement BtnUnCheckAllMCD;

    //Radio Button Demo

    @FindBy(how = How.XPATH,using = "//input[@value='Male'][@name='optradio']")
    public WebElement BtnMaleRBD;

    @FindBy(how = How.XPATH,using = "//input[@value='Female'][@name='optradio']")
    public WebElement BtnFemaleRBD;

    @FindBy(how = How.XPATH,using = "//button[@id='buttoncheck']")
    public WebElement BtnGetCheckValueRBD;

    @FindBy(how = How.XPATH,using = "//p[contains(text(),\"Radio button 'Male' is checked\")]")
    public WebElement LblSuccessMaleRBD;

    @FindBy(how = How.XPATH,using = "//p[contains(text(),\"Radio button 'Female' is checked\")]")
    public WebElement LblSuccessFemaleRBD;

    @FindBy(how = How.XPATH,using = "//input[@value='Male'][@name='gender']")
    public WebElement BtnMaleGRBD;

    @FindBy(how = How.XPATH,using = "//input[@value='Female'][@name='gender']")
    public WebElement BtnFemaleGRBD;

    @FindBy(how = How.XPATH,using = "//input[@value='0 - 5'][@name='ageGroup']")
    public WebElement BtnAgeGroup1GRBD;

    @FindBy(how = How.XPATH,using = "//input[@value='5 - 15'][@name='ageGroup']")
    public WebElement BtnAgeGroup2GRBD;

    @FindBy(how = How.XPATH,using = "//button[contains(.,'Get values')]")
    public WebElement BtnGetValueGRBD;

    @FindBy(how = How.XPATH,using = "//p[contains(.,'Sex : Male')][contains(.,' Age group: 0 - 5')]")
    public WebElement LblSuccessMaleGRBD;

    @FindBy(how = How.XPATH,using = "//p[contains(.,'Sex : Female')][contains(.,' Age group: 5 - 15')]")
    public WebElement LblSuccessFemaleGRBD;

    //Drop Down option

    @FindBy(how = How.XPATH,using = "//select[@id='select-demo']")
    public WebElement DDSelectADaySLD;

    @FindBy(how = How.XPATH,using = "//p[contains(text(),'Day selected :- Sunday')]")
    public WebElement LblDaySLD;

    @FindBy(how = How.XPATH,using = "//select[@id='multi-select']")
    public WebElement DDSelectPlaceMLD;

    @FindBy(how = How.XPATH,using = "//button[@id='printAll']")
    public WebElement BtnGetAllSelectedMLD;

    public String LblPlaceMLD = new StringBuilder("//p[contains(text(),'Options selected are : ")
            .append("<<REPLACE>>")
            .append("')]").toString();

    //Java script alert

    @FindBy(how = How.XPATH,using = "//button[@onclick='myAlertFunction()']")
    public WebElement BtnCallMeJSAB;

    @FindBy(how = How.XPATH,using = "//button[@onclick='myConfirmFunction()']")
    public WebElement BtnCallMeJSCB;

    @FindBy(how = How.XPATH,using = "//button[@onclick='myPromptFunction()']")
    public WebElement BtnClickForPromptBoxJSAB;

    public String LblEnterValueSAB = new StringBuilder("//p[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    //Window Popup Model

    @FindBy(how = How.XPATH,using = "//a[@title='Follow @seleniumeasy on Twitter']")
    public WebElement BtnFollowOnTwiterSWP;

    @FindBy(how = How.XPATH,using = "//a[@title='Follow @seleniumeasy on Facebook']")
    public WebElement BtnFollowOnFBSWP;

    //Bootstrap alert Option

    @FindBy(how = How.XPATH,using = "//button[@id='autoclosable-btn-success']")
    public WebElement BtnBootstrapSuccessBAM;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'autocloseable success  message. I will hide in 5 seconds.')]")
    public WebElement LblBootstrapSuccessBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='autoclosable-btn-warning']")
    public WebElement BtnBootstrapWarningBAM;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'autocloseable warning message. I will hide in 3 seconds.')]")
    public WebElement LblBootstrapWarningBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='autoclosable-btn-danger']")
    public WebElement BtnBootstrapDangerBAM;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'autocloseable danger message. I will hide in 5 seconds.')]")
    public WebElement LblBootstrapDangerBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='autoclosable-btn-info']")
    public WebElement BtnBootstrapInfoBAM;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'autocloseable info message. I will hide in 6 seconds.')]")
    public WebElement LblBootstrapInfoBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='normal-btn-success']")
    public WebElement BtnBootstrapNormalSuccessBAM;

    @FindBy(how = How.XPATH,using = "//div[@class='alert alert-success alert-normal-success']")
    public WebElement LblBootstrapNormalSuccessBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='normal-btn-warning']")
    public WebElement BtnBootstrapNormalWarningBAM;

    @FindBy(how = How.XPATH,using = "//div[@class='alert alert-warning alert-normal-warning']")
    public WebElement LblBootstrapNormalWarningBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='normal-btn-danger']")
    public WebElement BtnBootstrapNormalDangerBAM;

    @FindBy(how = How.XPATH,using = "//div[@class='alert alert-danger alert-normal-danger']")
    public WebElement LblBootstrapNormalDangerBAM;

    @FindBy(how = How.XPATH,using = "//button[@id='normal-btn-info']")
    public WebElement BtnBootstrapNormalInfoBAM;

    @FindBy(how = How.XPATH,using = "//div[@class='alert alert-info alert-normal-info']")
    public WebElement LblBootstrapNormalInfoBAM;

    //Bootstrap popup

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Single Modal Example')]/following::div[@class='panel-body'][1]//a[contains(.,'Launch modal')]")
    public WebElement BtnLaunchModalSME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal Title')]")
    public WebElement LblModalSME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal Title')]/following::a[contains(.,'Close')][1]")
    public WebElement BtnCloseModalSME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal Title')]/following::a[contains(.,'Save changes')][1]")
    public WebElement BtnSaveModalSME;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Multiple Modal Example')]/following::div[@class='panel-body']/a[contains(.,'Launch modal')]")
    public WebElement BtnLaunchModalMME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'First Modal')]")
    public WebElement LblFirstModalSME;

    @FindBy(how = How.XPATH,using = "//p[contains(.,'Clicking on Save Changes button will close the modal and refresh the page')]/following::a[contains(.,'Launch modal')]")
    public WebElement BtnFirstLaunchModalMME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'First Modal')]/following::a[contains(.,'Close')][1]")
    public WebElement BtnCloseFirstModalSME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'First Modal')]/following::a[contains(.,'Save changes')][1]")
    public WebElement BtnSaveFirstModalSME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal 2')]")
    public WebElement LblModal2SME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal 2')]/following::a[contains(.,'Close')][1]")
    public WebElement BtnCloseModal2SME;

    @FindBy(how = How.XPATH,using = "//h4[@class='modal-title'][contains(.,'Modal 2')]/following::a[contains(.,'Save changes')][1]")
    public WebElement BtnSaveModal2SME;

}
