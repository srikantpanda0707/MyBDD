package Tools;

import Utils.ConfigDataProvider;
import Utils.TestDatas;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class HooksClass extends BaseClass {

    ConfigDataProvider Config;

    @Before
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(TestDatas.URL);
    }
    @After
    public void QuitBrowser(){
        driver.quit();
    }

    public void Object(){ Config = new ConfigDataProvider();}
}
