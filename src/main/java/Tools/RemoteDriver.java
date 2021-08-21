package Tools;

import Utils.ObjectGenerator;
import Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriver {
    public static ThreadLocal<RemoteWebDriver> RDriver = new ThreadLocal<>();
//    public static ThreadLocal<ObjectGenerator> OBJ = new ThreadLocal<>();
    public static String remote_url = "http://localhost:4444/wd/hub";


    public WebDriver init_Rdriver(String browser) throws MalformedURLException {
//        OBJ.set(new ObjectGenerator());

        System.out.println("browser value is: " + browser);
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Inside Chrome");
            ChromeOptions options = new ChromeOptions();
            RDriver.set(new RemoteWebDriver(new URL(remote_url), options));

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Inside firefox");
            FirefoxOptions options = new FirefoxOptions();
            RDriver.set(new RemoteWebDriver(new URL(remote_url), options));
        }  else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().window().maximize();
        getDriver().get(PropertyReader.getProperty("url"));
        return getDriver();

    }


    public WebDriver getDriver() {
        return RDriver.get();
    }

//    public static synchronized ObjectGenerator getObjectGenerator() {
//        return OBJ.get();
//    }
}
