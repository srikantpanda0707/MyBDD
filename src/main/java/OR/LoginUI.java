package OR;

import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUI extends BaseClass {

    public LoginUI() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Agile Project')]")
    public WebElement LblAgileproject;

    @FindBy(how = How.XPATH,using = "//input[@name='uid']")
    public WebElement TxtBoxUserId;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public WebElement TxtBoxUserPswd;

    @FindBy(how = How.XPATH,using = "//input[@name='btnLogin']")
    public WebElement BtnLoginAGPR;

    @FindBy(how = How.XPATH,using = "//marquee[@class='heading3']")
    public WebElement LblCustomerBankHome;

    @FindBy(how = How.XPATH,using = "//a[text()='Log out']")
    public WebElement BtnLogOutHome;

}
