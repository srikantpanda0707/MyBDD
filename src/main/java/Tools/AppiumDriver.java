package Tools;

import Utils.ObjectGenerator;
import Utils.PropertyReader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriver {

    public static ThreadLocal<AndroidDriver<WebElement>> ADriver = new ThreadLocal<>();
//    public static ThreadLocal<ObjectGenerator> OBJ = new ThreadLocal<>();
    public static URL remote_url;

    static {
        try {
            remote_url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    public WebDriver init_APdriver(String browser) throws MalformedURLException {
//        OBJ.set(new ObjectGenerator());

        System.out.println("browser value is: " + browser);
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Inside Chrome");
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            cap.setCapability(CapabilityType.VERSION, "9");
            ADriver.set(new AndroidDriver(remote_url,cap));

        } else if (browser.equalsIgnoreCase("Native")) {
            System.out.println("Inside firefox");
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability(CapabilityType.VERSION, "9");
            cap.setCapability("appPackage","com.android.calculator2");
            cap.setCapability("appActivity","com.android.calculator2.Calculator");
            ADriver.set(new AndroidDriver(remote_url,cap));
//            ADriver.set(new RemoteWebDriver(new URL(remote_url), cap));
        }  else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        getDriver().get(PropertyReader.getProperty("url"));
        return getDriver();

    }


    public WebDriver getDriver() {
        return ADriver.get();
    }

//    public static synchronized ObjectGenerator getObjectGenerator() {
//        return OBJ.get();
//    }

}
