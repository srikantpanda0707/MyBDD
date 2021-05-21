package Tools;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static Properties property;


    public WebDriver getDriver(){
        return driver;
    }


}
