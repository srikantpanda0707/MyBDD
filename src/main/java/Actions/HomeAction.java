package Actions;
import OR.LoginUI;
import Tools.Elements;
import Tools.TextBox;
import Utils.TestDatas;


public class HomeAction extends LoginUI {

    public HomeAction(){
        super();
    }

    public boolean EnterMailIdLogin(){
            boolean IsEnter = false;
            if (LblAgileproject.isDisplayed()){
             Elements.click(driver, LblAgileproject);
             TextBox.EnterValue(TxtBoxUserId, TestDatas.UserID);
        TextBox.EnterValue(TxtBoxUserPswd, TestDatas.UserPswd);
            IsEnter = true;}
        return IsEnter;
    }

    public boolean ClickLoginBtn() {
        boolean IsClicked = true;
        Elements.click(driver, BtnLoginAGPR);
        return IsClicked;
    }

    public boolean VerifyHomePageDisplays(){
        boolean IsVerified = true;
        Elements.verifyElement(LblCustomerBankHome);
        return IsVerified;
    }
    public boolean ClickLogOutBtn(){
        boolean IsClicked = true;
            Elements.click(driver,BtnLogOutHome);
        return IsClicked;
    }
}
