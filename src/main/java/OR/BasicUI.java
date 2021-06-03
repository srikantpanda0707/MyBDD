package OR;

import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasicUI extends BaseClass {

    public BasicUI() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Selenium Easy')]")
    public WebElement LblSeleniumEasy;

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Demo Home')]")
    public WebElement BtnDemoHomeSE;

    @FindBy(how = How.XPATH,using = "//h3[contains(text(),'Welcome to Selenium Easy ')]")
    public WebElement LblWlCumDemoSE;

    @FindBy(how = How.XPATH,using = "//a[@id='btn_basic_example']")
    public WebElement BtnStartPracticeSE;

}
