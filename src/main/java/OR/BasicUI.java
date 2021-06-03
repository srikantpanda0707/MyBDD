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

    @FindBy(how = How.XPATH,using = "//div[@class='list-group']//a[contains(text(),'Simple Form Demo')]")
    public WebElement BtnSimpleDemoFormBtnDH;

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


}
