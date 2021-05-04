package Actions;
import OR.LoginUI;
import Utils.TestDatas;
import org.hamcrest.core.Is;
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

    public boolean clicktelecomproject() {
        boolean IsClicked = true;
        WebElement ele = driver.findElement(By.xpath(BtnGuruTab.replace("<<REPLACE>>",TestDatas.Telecom)));
        ele.click();
        return IsClicked;
    }

    public boolean clickaddcustome() {
        boolean IsClicked = true;
        WebElement ele = driver.findElement(By.xpath(BtnGuruTab.replace("<<REPLACE>>",TestDatas.TelecomAddCust)));
        ele.click();
        return IsClicked;
    }

    public boolean Verifyaddcustomer() {
        boolean IsVerify = true;
        LblAddCustomer.isDisplayed();
        return IsVerify;
    }

    public boolean Addnewtelecomcust() {
        boolean IsAdd = true;
        BtnRadPendingAddCust.click();
        TxtFnameAddCust.sendKeys(TestDatas.FnameTelecom);
        TxtLnameAddCust.sendKeys(TestDatas.LnameTelecomAddCust);
        TxtEmailAddCust.sendKeys(TestDatas.EmailTelecomAddCust);
        TxtAddressAddCust.sendKeys(TestDatas.AddressTelecomAddCust);
        TxtPhoneNumAddCust.sendKeys(TestDatas.MobileNumTelecomAddCust);
        BtnSubmitAddCust.click();
        //WebElement Added = driver.findElement(By.xpath(String.valueOf(LblAddedCustAddCust)));
        String  ABC = LblAddedCustAddCust.getText();
        BtnHomeAddCust.click();
        BtnPayBillingTelecomPage.click();
        TxtEnterCustIDPayBill.sendKeys(ABC);
        BtnSubmitPayBill.click();
        return IsAdd;
    }

    public boolean VerifyThecustomerGotCreated() {
        boolean IsVerify = true;
        //WebElement Added = driver.findElement(By.xpath(String.valueOf(LblAddedCustPayBill)));
        String  ABC = LblAddedCustPayBill.getText();
        String Customer = String.valueOf(ABC.contains(TestDatas.FnameTelecom));
        Customer.equals(TestDatas.FnameTelecom);
        System.out.println(ABC);
        System.out.println(Customer);
        return IsVerify;    }
}
