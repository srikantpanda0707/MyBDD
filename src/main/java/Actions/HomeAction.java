package Actions;
import Tools.BaseClass;
import Tools.Elements;
import Tools.TextBox;
import Utils.TestDatas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomeAction extends BaseClass {

    public HomeAction(WebDriver driver){

        PageFactory.initElements(HomeAction.driver, this);

    }

    @FindBy(how = How.XPATH,using = "//input[@name='emailid']")
    public static WebElement TxtBoxMailId;

    @FindBy(how = How.XPATH,using = "//input[@name='btnLogin']")
    public static WebElement BtnSubmitLogin;

    @FindBy(how = How.XPATH,using = "//input[@name='btnLogin']")
    public static WebElement LblAccessDetailsHome;

    @FindBy(how = How.XPATH,using = "//h3[contains(text(),'This access is valid only for 20 days.')]")
    public static WebElement LblValidityHome;


    public static boolean EnterMailIdLogin(){
            boolean IsEnter = false;
            if (TxtBoxMailId.isDisplayed()){
       IsEnter = TextBox.EnterValue(TxtBoxMailId, TestDatas.EmailId);
            IsEnter = true;}
            else{
               System.out.println("Action email id fails");
        }
            return IsEnter;
    }

    public static boolean ClickSubmitBtn(){
        boolean IsClicked = false;
        IsClicked = Elements.click(driver,BtnSubmitLogin);
        return IsClicked;
    }

    public static boolean VerifyHomePageDisplays(){
        boolean IsVerified = false;
        Elements.verifyElement(LblAccessDetailsHome);
        return IsVerified;
    }


    public static boolean VerifyHomePageValidity() {
        boolean IsVerified = false;
        Elements.verifyElement(LblValidityHome);
        return IsVerified;

    }
}
