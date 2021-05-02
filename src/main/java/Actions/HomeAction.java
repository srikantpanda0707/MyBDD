package Actions;
import OR.LoginUI;
import Utils.TestDatas;


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
}
