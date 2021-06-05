package Actions;

import OR.BasicUI;
import Tools.*;
import Utils.TestDatas;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import sun.awt.Symbol;

import javax.xml.soap.Text;

public class BasicAction extends BasicUI {


    public boolean VerifySeleniumEasyDisplays() {
        boolean IsVerified = true;
        TextBox.verifyElement(LblSeleniumEasy);
        return IsVerified;

    }

    public boolean ClickDemoHomeBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                Elements.click(LearnSeleniumPopup);
            }
            Sync.waitForSeconds(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            Elements.click(BtnDemoHomeSE);
        }

        return IsClicked;
    }

    public boolean VerifyDemoHomePageDisplays() {
        boolean IsVerified = true;
        TextBox.verifyElement(LblWlCumDemoSE);
        return IsVerified;
    }

    public boolean ClickStartPracticeBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                Elements.click(LearnSeleniumPopup);
            }
            Sync.waitForSeconds(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            Elements.click(BtnStartPracticeSE);
            Sync.waitForSeconds(3);
        }

        return IsClicked;
    }

    public boolean ClickSimpleFormDemoBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                Elements.click(LearnSeleniumPopup);
            }
            Sync.waitForSeconds(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            Elements.Builberclick(driver, BasicPageOptions, TestDatas.SFD);
        }

        return IsClicked;
    }

    public boolean EnterMessageSimpleInputTxtBox() {
        boolean isEntered = true;
        TextBox.enterValue(driver, TxtBoxEnterMessageSimpleInputDH, TestDatas.MessageSimple);
        Elements.click(BtnShowMessageSimpleInputDH);
        return isEntered;
    }

    public boolean VerifyMessageDisplaysSFD() {
        boolean isVerified = true;
        TextBox.CompareText(driver, LblYourMessageSimpleInputDH, TestDatas.MessageSimple);
        return isVerified;
    }

    public boolean EnterValueIntwoInputTxtBox() {
        boolean isEntered = true;
        TextBox.enterValue(driver, TxtBoxEnteraTwoInputDH, TestDatas.EnterA);
        TextBox.enterValue(driver, TxtBoxEnterbTwoInputDH, TestDatas.EnterB);
        Elements.click(BtnGetTotalTwoInputDH);
        return isEntered;
    }

    public boolean VerifyGetTotalDisplaysSFD() {
        boolean isVerified = true;
        String S1 = TextBox.getText(driver, TxtBoxEnteraTwoInputDH);
        String S2 = TextBox.getText(driver, TxtBoxEnterbTwoInputDH);
        String S3 = S1 + S2;
        TextBox.CompareText(driver, LblTotalTwoInputDH, S3);
        return isVerified;
    }

    public boolean ClickCheckBoxOptionBtn() {
        boolean IsClicked = true;
        try {
            if (LearnSeleniumPopup.isDisplayed()) {
                Elements.click(LearnSeleniumPopup);
            }
            Sync.waitForSeconds(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            Elements.Builberclick(driver, BasicPageOptions, TestDatas.CBD);
            Sync.waitForSeconds(5);
        }
        return IsClicked;
    }

    public boolean ClickAndVerifyThecheckBoxOption() {
        boolean isClickandVerify = true;
        Elements.click(BtnClickCheckBoxSCD);
        TextBox.verifyElement(LblSuccessSCD);
        Elements.click(BtnCheckAllMCD);
        Elements.click(BtnUnCheckAllMCD);
        Elements.click(BtnCheckAllMCD);
        return isClickandVerify;
    }

    public boolean ClickRadioButtonOptionBtn() {
        boolean IsClicked = true;
        Elements.Builberclick(driver, BasicPageOptions, TestDatas.RBD);
        return IsClicked;
    }

    public boolean ClickRadioButtonandVerify() {
        boolean isClickandVerify = true;
        Elements.click(BtnMaleRBD);
        Elements.click(BtnGetCheckValueRBD);
        TextBox.verifyElement(LblSuccessMaleRBD);
        Elements.click(BtnFemaleRBD);
        Elements.click(BtnGetCheckValueRBD);
        TextBox.verifyElement(LblSuccessFemaleRBD);
        return isClickandVerify;
    }

    public boolean ClickGroupRadioButtonandVerify() {
        boolean isClickandVerify = true;
        Elements.click(BtnMaleGRBD);
        Elements.click(BtnAgeGroup1GRBD);
        Elements.click(BtnGetValueGRBD);
        TextBox.verifyElement(LblSuccessMaleGRBD);
        Elements.click(BtnFemaleGRBD);
        Elements.click(BtnAgeGroup2GRBD);
        Elements.click(BtnGetValueGRBD);
        TextBox.verifyElement(LblSuccessFemaleGRBD);
        return isClickandVerify;

    }

    public boolean ClickDropDownOptionBtn() {
        boolean IsClicked = true;
        Elements.Builberclick(driver, BasicPageOptions, TestDatas.SDL);
        return IsClicked;
    }

    public boolean SelectSingleDropDownAndVerify() {
        boolean isSelect = true;
        DropDown.selectByText(DDSelectADaySLD, TestDatas.Days);
        TextBox.verifyElement(LblDaySLD);
        DropDown.selectByValue(DDSelectPlaceMLD, TestDatas.Place);
        Elements.click(BtnGetAllSelectedMLD);
        WebElement ele = driver.findElement(By.xpath(LblPlaceMLD.replace("<<REPLACE>>", TestDatas.Place)));
        TextBox.verifyElement(ele);
        return isSelect;
    }

    public boolean SelectGroupDropDownAndVerify() {
        boolean isSelect = true;
        DropDown.selectByValue(DDSelectPlaceMLD, TestDatas.Place1);
        Sync.waitForSeconds(10);
        DropDown.selectByValue(DDSelectPlaceMLD, TestDatas.Place);
        Elements.click(BtnGetAllSelectedMLD);
        WebElement ele = driver.findElement(By.xpath(LblPlaceMLD.replace("<<REPLACE>>", TestDatas.Place1)));
        TextBox.verifyElement(ele);
        return isSelect;
    }

    public boolean ClickJSAlterOption() {
        boolean IsClicked = true;
        Elements.Builberclick(driver, BasicPageOptions, TestDatas.JSA);
        return IsClicked;
    }

    public boolean AcceptandDismissAlertJSA() {
        boolean isclickandVerify = true;
        Elements.click(BtnCallMeJSAB);
        Alert.acceptAlert(driver);
        Elements.click(BtnCallMeJSAB);
        Alert.dismissAlert(driver);
        Elements.click(BtnCallMeJSCB);
        Alert.acceptAlert(driver);
        Elements.click(BtnCallMeJSCB);
        Alert.dismissAlert(driver);
        return isclickandVerify;
    }

    public boolean EntervalueAcceptAlert() {
        boolean isEnterandverify = true;
        Elements.click(BtnClickForPromptBoxJSAB);
        Alert.acceptAlertByText(driver, TestDatas.Place);
        WebElement ele = driver.findElement(By.xpath(LblEnterValueSAB.replace("<<REPLACE>>", TestDatas.Place)));
        TextBox.verifyElement(ele);
        System.out.println("Accept is successfull" + ele);
        return isEnterandverify;
    }

    public boolean EntervalueDismissAlert() {
        boolean isEnterandverify = true;
        Elements.click(BtnClickForPromptBoxJSAB);
        Alert.DismissAlertByText(driver, TestDatas.Place1);
        WebElement ele1 = driver.findElement(By.xpath(LblEnterValueSAB.replace("<<REPLACE>>", TestDatas.Place)));
        TextBox.verifyElement(ele1);
        System.out.println("Dismiss is successfull" + ele1);
        return isEnterandverify;
    }
}
