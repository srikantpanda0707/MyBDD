package Tools;

import Utils.TestDatas;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
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
}
