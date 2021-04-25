package Actions;
import OR.LoginUI;
import Tools.BaseClass;
import Tools.Elements;
import Tools.TextBox;
import Utils.TestDatas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class HomeAction extends LoginUI {

    public HomeAction(WebDriver driver) {
        super(driver);
    }

    public static boolean EnterMailIdLogin(){
            boolean IsEnter = true;
             Elements.mouseClick(driver, LblAgileproject);
             TextBox.EnterValue(TxtBoxUserId, TestDatas.UserID);
        TextBox.EnterValue(TxtBoxUserPswd, TestDatas.UserPswd);
        return IsEnter;
    }

    public static boolean ClickLoginBtn() {
        boolean IsClicked = true;
        Elements.click(driver, BtnLoginAGPR);
        return IsClicked;
    }

    public static boolean VerifyHomePageDisplays(){
        boolean IsVerified = true;
        Elements.verifyElement(LblCustomerBankHome);
        return IsVerified;
    }
    public static boolean ClickLogOutBtn(){
        boolean IsClicked = true;
            Elements.click(driver,BtnLogOutHome);
        return IsClicked;
    }
}
