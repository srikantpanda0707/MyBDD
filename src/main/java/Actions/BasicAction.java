package Actions;

import OR.BasicUI;
import Tools.Elements;
import Tools.TextBox;

public class BasicAction extends BasicUI {


    public boolean VerifySeleniumEasyDisplays() {
        boolean IsVerified = true;
        TextBox.verifyElement(LblSeleniumEasy);
        return IsVerified;

    }

    public boolean ClickDemoHomeBtn() {
        boolean IsClicked = true;
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
}
