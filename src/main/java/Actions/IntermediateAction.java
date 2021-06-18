package Actions;



import OR.IntermediateUI;
import Utils.ConfigDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;


public class IntermediateAction extends IntermediateUI {
    private final WebDriver driver;
    Properties prop;
    ObjectGenerator OG = getObjectGenerator();
    ConfigDataProvider CDP = getConfigDataProvider();

    public IntermediateAction() {
        super();
        this.driver = getDriver();
        OG.initPage();
        prop = CDP.DataProvider();
    }

    public boolean SelectInputFormOption() {
        boolean isSelect = true;
        OG.ele.click(DDInputFormHomePage);
        OG.ele.Builberclick(driver, ValInputFormHomePage,OG.testDatas.IFS);
        return isSelect;
    }

    public boolean EnterInputFormAndVerify() {
        boolean isEnterAndVerify = true;
        OG.textBox.enterValue(driver, TxtBoxFirstnameIFS, OG.testDatas.MessageSimple);
        OG.textBox.enterValue(driver, TxtBoxLastnameIFS, OG.testDatas.MessageSimple);
        OG.textBox.enterValue(driver, TxtBoxEmailIdIFS, OG.testDatas.EmailId);
        OG.textBox.enterValue(driver, TxtBoxPhoneIFS, OG.testDatas.PhoneNum);
        OG.textBox.enterValue(driver, TxtBoxAddressIFS, OG.testDatas.Place1);
        OG.textBox.enterValue(driver, TxtBoxCityIFS, OG.testDatas.Place);
        OG.textBox.enterValue(driver, TxtBoxStateIFS, OG.testDatas.Place);
        OG.textBox.enterValue(driver, TxtBoxZipCodeIFS, OG.testDatas.ZipCode);
        OG.textBox.enterValue(driver, TxtBoxProjectDescriptionIFS, OG.testDatas.IFS);
        OG.sync.waitForSeconds(3000);
        List<WebElement> ele = driver.findElements(By.xpath(String.valueOf(VerifyTickIFS)));
        int count = ele.size();
        if (count == 8){
            OG.ele.click(BtnSendIFS);
            System.out.println("Verified the count");
        }
        return isEnterAndVerify;
    }

    public boolean VerifyFormSentIFS() {
        boolean isVerified = true;
        OG.sync.waitForSeconds(3000);
        List<WebElement> ele1 = driver.findElements(By.xpath(String.valueOf(VerifySendIFS)));
        int count1 = ele1.size();
        if (count1 == 9){
            System.out.println("Verified the Send count");
        }
        return isVerified;
    }

    public boolean SelectAjaxFormOption() {
        boolean isSelect = true;
        OG.ele.click(DDInputFormHomePage);
        OG.ele.Builberclick(driver, ValInputFormHomePage,OG.testDatas.AFS);
        return isSelect;
    }

    public boolean VerifyMaditoryFieldByEmptyText() {
        boolean isVerified = true;
        OG.ele.click(BtnSubmitAFS);
        OG.textBox.verifyElement(LblMaditoryStarAFS);
        return isVerified;
    }

    public boolean EnterValdTextAndVerify() {
        boolean isEnterAndVerify = true;
        OG.textBox.enterValue(driver, TxtBoxNameAFS, prop.getProperty("MessageSimple"));
        OG.textBox.enterValue(driver, TxtBoxCommentAFS, prop.getProperty("MessageSimple"));
        OG.ele.click(BtnSubmitAFS);
        return isEnterAndVerify;
    }

    public boolean VerifytheSuccessmessage() {
        boolean isVerified = true;
        OG.sync.ExplicityWait(driver,LblSubmitedSuccessfulAFS,5000);
        OG.textBox.verifyElement(LblSubmitedSuccessfulAFS);
        return isVerified;
    }
}
