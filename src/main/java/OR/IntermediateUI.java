package OR;


import Tools.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IntermediateUI extends BaseClass {

    public IntermediateUI() {
        PageFactory.initElements(getDriver(), this);
    }



        @FindBy(how = How.XPATH,using = "//a[contains(text(),'Selenium Easy')]")
        public WebElement DDInputFormHomePage;


}

