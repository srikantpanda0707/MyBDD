package Actions;

import OR.HomeUI;
import Tools.Browser;
import Tools.Elements;
import Utils.TestDatas;
import org.openqa.selenium.WebDriver;

public class HomeAction extends HomeUI {
Browser BO = new Browser();

    public HomeAction(WebDriver driver) {
        super(driver);
    }

    public boolean LaunchChrome(){
        boolean IsLaunched = false;
       Browser.LaunchBrowser();
        return IsLaunched;
    }

    public boolean GetID(){
        boolean IsOpen = false;
        Browser.geturl("http://demo.guru99.com/");
        return IsOpen;
    }

    public boolean VerifyHomeLogo(){
        boolean IsVerify = false;
        Elements.verifyElement(LoginLogoImg);
        return IsVerify;
    }
    public boolean CloseChrome(){
        boolean Close = false;
        Browser.QuitBrowser();
        return Close;
    }
}
