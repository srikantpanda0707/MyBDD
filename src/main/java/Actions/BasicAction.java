package Actions;

import OR.BasicUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicAction extends BasicUI {

    ObjectGenerator OG = new ObjectGenerator();

    public BasicAction(WebDriver driver) {
        super(driver);
    }


    public boolean VerifySeleniumEasyDisplays() {
        boolean IsVerified = true;
        OG.textBox.verifyElement(LblSeleniumEasy);
        return IsVerified;

    }

    public boolean ClickDemoHomeBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                OG.ele.click(LearnSeleniumPopup);
            }
            OG.sync.waitForSeconds(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            OG.ele.click(BtnDemoHomeSE);
        }

        return IsClicked;
    }

    public boolean VerifyDemoHomePageDisplays() {
        boolean IsVerified = true;
        OG.textBox.verifyElement(LblWlCumDemoSE);
        return IsVerified;
    }

    public boolean ClickStartPracticeBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                OG.ele.click(LearnSeleniumPopup);
            }
            OG.sync.waitForSeconds(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            OG.ele.click(BtnStartPracticeSE);
            OG.sync.waitForSeconds(3000);
        }

        return IsClicked;
    }

    public boolean ClickSimpleFormDemoBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                OG.ele.click(BtnStartPracticeSE);
            }
            OG.sync.waitForSeconds(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            OG.ele.Builberclick(driver,BasicPageOptions, OG.testDatas.SFD);
        }

        return IsClicked;
    }

    public boolean EnterMessageSimpleInputTxtBox() {
        boolean isEntered = true;
        OG.textBox.enterValue(driver,TxtBoxEnterMessageSimpleInputDH, OG.testDatas.MessageSimple);
        OG.ele.click(BtnShowMessageSimpleInputDH);
        return isEntered;
    }

    public boolean VerifyMessageDisplaysSFD() {
        boolean isVerified = true;
        OG.textBox.CompareText(driver,LblYourMessageSimpleInputDH,OG.testDatas.MessageSimple);
        return isVerified;
    }

    public boolean EnterValueIntwoInputTxtBox() {
        boolean isEntered = true;
        OG.textBox.enterValue(driver,TxtBoxEnteraTwoInputDH, OG.testDatas.EnterA);
        OG.textBox.enterValue(driver,TxtBoxEnterbTwoInputDH, OG.testDatas.EnterB);
        OG.ele.click(BtnGetTotalTwoInputDH);
        return isEntered;
    }

    public boolean VerifyGetTotalDisplaysSFD() {
        boolean isVerified = true;
        String S1 = OG.textBox.getText(driver, TxtBoxEnteraTwoInputDH);
        String S2 = OG.textBox.getText(driver, TxtBoxEnterbTwoInputDH);
        String S3 = S1 + S2;
        OG.textBox.CompareText(driver, LblTotalTwoInputDH, S3);
        return isVerified;
    }

    public boolean ClickCheckBoxOptionBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                OG.ele.click(LearnSeleniumPopup);
            }
            OG.sync.waitForSeconds(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            OG.ele.Builberclick(driver, BasicPageOptions, OG.testDatas.CBD);
            OG.sync.waitForSeconds(5000);
        }
        return IsClicked;
    }

    public boolean ClickAndVerifyThecheckBoxOption() {
        boolean isClickandVerify = true;
        OG.ele.click(BtnClickCheckBoxSCD);
        OG.textBox.verifyElement(LblSuccessSCD);
        OG.ele.click(BtnCheckAllMCD);
        OG.ele.click(BtnUnCheckAllMCD);
        OG.ele.click(BtnCheckAllMCD);
        return isClickandVerify;
    }

    public boolean ClickRadioButtonOptionBtn() {
        boolean IsClicked = true;
        OG.ele.Builberclick(driver, BasicPageOptions, OG.testDatas.RBD);
        return IsClicked;
    }

    public boolean ClickRadioButtonandVerify() {
        boolean isClickandVerify = true;
        OG.ele.click(BtnMaleRBD);
        OG.ele.click(BtnGetCheckValueRBD);
        OG.textBox.verifyElement(LblSuccessMaleRBD);
        OG.ele.click(BtnFemaleRBD);
        OG.ele.click(BtnGetCheckValueRBD);
        OG.textBox.verifyElement(LblSuccessFemaleRBD);
        return isClickandVerify;
    }

    public boolean ClickGroupRadioButtonandVerify() {
        boolean isClickandVerify = true;
        OG.ele.click(BtnMaleGRBD);
        OG.ele.click(BtnAgeGroup1GRBD);
        OG.ele.click(BtnGetValueGRBD);
        OG.textBox.verifyElement(LblSuccessMaleGRBD);
        OG.ele.click(BtnFemaleGRBD);
        OG.ele.click(BtnAgeGroup2GRBD);
        OG.ele.click(BtnGetValueGRBD);
        OG.textBox.verifyElement(LblSuccessFemaleGRBD);
        return isClickandVerify;

    }

    public boolean ClickDropDownOptionBtn() {
        boolean IsClicked = true;
        OG.ele.Builberclick(driver, BasicPageOptions, OG.testDatas.SDL);
        return IsClicked;
    }

    public boolean SelectSingleDropDownAndVerify() {
        boolean isSelect = true;
        OG.DD.selectByText(DDSelectADaySLD, OG.testDatas.Days);
        OG.textBox.verifyElement(LblDaySLD);
        OG.DD.selectByValue(DDSelectPlaceMLD, OG.testDatas.Place);
        OG.ele.click(BtnGetAllSelectedMLD);
        WebElement ele = driver.findElement(By.xpath(LblPlaceMLD.replace("<<REPLACE>>", OG.testDatas.Place)));
        OG.textBox.verifyElement(ele);
        return isSelect;
    }

    public boolean SelectGroupDropDownAndVerify() {
        boolean isSelect = true;
        OG.DD.selectByValue(DDSelectPlaceMLD, OG.testDatas.Place1);
        OG.sync.waitForSeconds(1000);
        OG.DD.selectByValue(DDSelectPlaceMLD, OG.testDatas.Place);
        OG.ele.click(BtnGetAllSelectedMLD);
        WebElement ele = driver.findElement(By.xpath(LblPlaceMLD.replace("<<REPLACE>>", OG.testDatas.Place1)));
        OG.textBox.verifyElement(ele);
        return isSelect;
    }

    public boolean ClickJSAlterOption() {
        boolean IsClicked = true;
        OG.ele.Builberclick(driver, BasicPageOptions, OG.testDatas.JSA);
        return IsClicked;
    }

    public boolean AcceptandDismissAlertJSA() {
        boolean isclickandVerify = true;
        OG.ele.click(BtnCallMeJSAB);
        OG.alert.acceptAlert(driver);
        OG.ele.click(BtnCallMeJSAB);
        OG.alert.dismissAlert(driver);
        OG.ele.click(BtnCallMeJSCB);
        OG.alert.acceptAlert(driver);
        OG.ele.click(BtnCallMeJSCB);
        OG.alert.dismissAlert(driver);
        return isclickandVerify;
    }

    public boolean EntervalueAcceptAlert() {
        boolean isEnterandverify = true;
        OG.ele.click(BtnClickForPromptBoxJSAB);
        OG.alert.acceptAlertByText(driver, OG.testDatas.Place);
        WebElement ele = driver.findElement(By.xpath(LblEnterValueSAB.replace("<<REPLACE>>", OG.testDatas.Place)));
        OG.textBox.verifyElement(ele);
        System.out.println("Accept is successfull" + ele);
        return isEnterandverify;
    }

    public boolean EntervalueDismissAlert() {
        boolean isEnterandverify = true;
        OG.ele.click(BtnClickForPromptBoxJSAB);
        OG.alert.DismissAlertByText(driver, OG.testDatas.Place1);
        WebElement ele1 = driver.findElement(By.xpath(LblEnterValueSAB.replace("<<REPLACE>>", OG.testDatas.Place)));
        OG.textBox.verifyElement(ele1);
        System.out.println("Dismiss is successfull" + ele1);
        return isEnterandverify;
    }

    public boolean ClickWindowPopupOption() {
        boolean IsClicked = true;
        OG.ele.Builberclick(driver, BasicPageOptions, OG.testDatas.WPM);
        return IsClicked;
    }

    public boolean ClickTwiterPopAndVerify() {
        boolean isclickandVerify = true;
        OG.ele.click(BtnFollowOnTwiterSWP);
        OG.window.switchtoChildWindow(driver);
        OG.window.MaxWindow(driver);
        OG.window.GetWindowName(driver);
        OG.window.closeWindow(driver);
        return isclickandVerify;
    }
}
