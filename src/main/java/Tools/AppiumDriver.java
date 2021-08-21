package Tools;

import Utils.ObjectGenerator;
import Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {

    public static ThreadLocal<RemoteWebDriver> ADriver = new ThreadLocal<>();
    public static ThreadLocal<ObjectGenerator> OBJ = new ThreadLocal<>();
    public static String remote_url = "http://0.0.0.0:4725/wd/hub";


    public WebDriver init_APdriver(String browser) throws MalformedURLException {
        OBJ.set(new ObjectGenerator());

        System.out.println("browser value is: " + browser);
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Inside Chrome");
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            cap.setCapability(CapabilityType.VERSION, "9");
            ADriver.set(new RemoteWebDriver(new URL(remote_url), cap));

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Inside firefox");
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability(CapabilityType.BROWSER_NAME, "Firefox");
            cap.setCapability(CapabilityType.VERSION, "9");
            ADriver.set(new RemoteWebDriver(new URL(remote_url), cap));
        }  else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().get(PropertyReader.getProperty("url"));
        return getDriver();

    }


    public WebDriver getDriver() {
        return ADriver.get();
    }

    public static synchronized ObjectGenerator getObjectGenerator() {
        return OBJ.get();
    }

}
