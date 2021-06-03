package Actions;

import OR.BasicUI;
import Tools.Alert;
import Tools.Elements;
import Tools.Sync;
import Tools.TextBox;
import Utils.TestDatas;

public class BasicAction extends BasicUI {


    public boolean VerifySeleniumEasyDisplays() {
        boolean IsVerified = true;
        TextBox.verifyElement(LblSeleniumEasy);
        return IsVerified;

    }

    public boolean ClickDemoHomeBtn() {
        boolean IsClicked = true;
        if (LearnSeleniumPopup.isDisplayed()){
            Elements.click(LearnSeleniumPopup);}
        Sync.waitForSeconds(5);
        Elements.click(BtnDemoHomeSE);
        return IsClicked;
    }

    public boolean VerifyDemoHomePageDisplays() {
        boolean IsVerified = true;
        TextBox.verifyElement(LblWlCumDemoSE);
        return IsVerified;
    }

    public boolean ClickStartPracticeBtn() {
        boolean IsClicked = true;
        Elements.click(BtnStartPracticeSE);
        return IsClicked;
    }

    public boolean ClickSimpleFormDemoBtn() {
        boolean IsClicked = true;
        Elements.click(BtnSimpleDemoFormBtnDH);
        return IsClicked;
    }

    public boolean EnterMessageSimpleInputTxtBox() {
        boolean isEntered = true;
        TextBox.enterValue(driver,TxtBoxEnterMessageSimpleInputDH, TestDatas.MessageSimple);
        Elements.click(BtnShowMessageSimpleInputDH);
        return  isEntered;
    }

    public boolean VerifyMessageDisplaysSFD() {
        boolean isVerified = true;
        TextBox.CompareText(driver, LblYourMessageSimpleInputDH,TestDatas.MessageSimple);
        return isVerified;
    }

    public boolean EnterValueIntwoInputTxtBox() {
        boolean isEntered = true;
        TextBox.enterValue(driver,TxtBoxEnteraTwoInputDH, TestDatas.EnterA);
        TextBox.enterValue(driver,TxtBoxEnterbTwoInputDH, TestDatas.EnterB);
        Elements.click(BtnGetTotalTwoInputDH);
        return  isEntered;
    }

    public boolean VerifyGetTotalDisplaysSFD() {
        boolean isVerified = true;
        String S1 = TextBox.getText(driver,TxtBoxEnteraTwoInputDH);
        String S2 = TextBox.getText(driver,TxtBoxEnterbTwoInputDH);
        String S3 = S1+S2;
        TextBox.CompareText(driver, LblTotalTwoInputDH,S3);
        return isVerified;
    }
}
