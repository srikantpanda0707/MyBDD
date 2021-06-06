package OR;

import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasicUI extends BaseClass {

    public BasicUI() {
        PageFactory.initElements(driver, this);
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


}
