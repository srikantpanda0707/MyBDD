package Tools;

import Actions.ObjectGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseClass {

//    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public static ThreadLocal<ObjectGenerator> OBJ = new ThreadLocal<>();


    public WebDriver init_driver(String browser) {

        System.out.println("browser value is: " + browser);
        OBJ.set(new ObjectGenerator());
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equalsIgnoreCase("IE")) {
            tlDriver.set(new InternetExplorerDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().window().maximize();
        return getDriver();

    }

    public WebDriver getDriver() {
        return tlDriver.get();
    }

    public static synchronized  ObjectGenerator getObjectGenerator(){
        return OBJ.get();
    }


}
