package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeUI {
    public static WebDriver driver;

    public HomeUI(WebDriver driver){

        PageFactory.initElements(HomeUI.driver, this);
        this.driver = HomeUI.driver;

    }


    @FindBy(how = How.XPATH,using = "//a//img[@alt='Guru99 Demo Sites']")
    protected WebElement LoginLogoImg;


}
