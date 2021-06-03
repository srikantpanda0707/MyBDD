package Tools;

import org.openqa.selenium.WebDriver;



public class BaseClass {

    //    private static BaseClass InstanceDriver = null;
    public static WebDriver driver;

    //    private static final ConfigDataProvider CDP = new ConfigDataProvider();
//
//    public BaseClass(){
//
//    }
//
//    public  WebDriver Init_Driver(String Browser) {
//        Properties property = CDP.returnProperty();
//        switch (Browser) {
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//            case "Firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            case "IE":
//                WebDriverManager.iedriver().setup();
//                driver = new InternetExplorerDriver();
//                break;
//        }
//        Sync.ImplicityWait(20);
//        driver.manage().window().maximize();
//        driver.get(property.getProperty("URL"));
//
//        return driver;
//    }
//
//    public static BaseClass getInstanceDriver(){
//        if (InstanceDriver == null)
//            InstanceDriver = new BaseClass();
//            return InstanceDriver;
//
//    }
    public static WebDriver getDriver() {
        return driver;
    }

    public static void QuitBrowser() {
        driver.quit();
    }


}
