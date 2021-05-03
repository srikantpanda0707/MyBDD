package Actions;
import OR.LoginUI;
import Utils.TestDatas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomeAction extends LoginUI {

    public HomeAction(){
        super();
    }

    public boolean EnterMailIdLogin(){
            boolean IsEnter = false;
            if (LblAgileproject.isDisplayed()){
                LblAgileproject.click();
                TxtBoxUserId.sendKeys(TestDatas.UserID);
                TxtBoxUserPswd.sendKeys(TestDatas.UserPswd);
                    IsEnter = true;}
        return IsEnter;
    }

    public boolean ClickLoginBtn() {
        boolean IsClicked = true;
        BtnLoginAGPR.click();
        return IsClicked;
    }

    public boolean VerifyHomePageDisplays(){
        boolean IsVerified = true;
        LblCustomerBankHome.isDisplayed();
        return IsVerified;
    }
    public boolean ClickLogOutBtn(){
        boolean IsClicked = true;
        BtnLogOutHome.click();
        return IsClicked;
    }
    public boolean ClickMiniStatBtn() {
        boolean IsClicked = true;
        BtnMiniStatementHome.click();
        return IsClicked;
    }
    public boolean SelectStatementNum() {
        boolean IsClicked = true;
        BtnStatementNum.click();
        WebElement ele = driver.findElement(By.xpath(DWMinistatement.replace("<<REPLACE>>",TestDatas.StatementNum)));
        ele.click();
        return IsClicked;
    }

    public boolean ClickSubmitMSF() {
        boolean IsClicked = true;
        BtnSubmitMSF.click();
        return IsClicked;
    }

    public boolean VerifyStatementDisplays() {
        boolean IsVerify = true;
        WebElement ele = driver.findElement(By.xpath(LblSelectedStNum.replace("<<REPLACE>>",TestDatas.StatementNum)));
        ele.isDisplayed();
        return IsVerify;
    }

    public boolean ClickContinueButton() {
        boolean IsClicked = true;
        BtnContinueMSF.click();
        return IsClicked;


    }
}
