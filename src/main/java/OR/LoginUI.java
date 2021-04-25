package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUI {
    protected static WebDriver driver;

    public LoginUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginUI.driver = driver;
    }

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Agile Project')]")
    public static WebElement LblAgileproject;

    @FindBy(how = How.XPATH,using = "//input[@name='uid']")
    public static WebElement TxtBoxUserId;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public static WebElement TxtBoxUserPswd;

    @FindBy(how = How.XPATH,using = "//input[@name='btnLogin']")
    public static WebElement BtnLoginAGPR;

    @FindBy(how = How.XPATH,using = "//marquee[@class='heading3']")
    public static WebElement LblCustomerBankHome;

    @FindBy(how = How.XPATH,using = "//a[text()='Log out']")
    public static WebElement BtnLogOutHome;

}
