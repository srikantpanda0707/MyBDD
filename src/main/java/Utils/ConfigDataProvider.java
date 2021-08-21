package Utils;



import Tools.BaseClass;
import Tools.RemoteDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider extends BaseClass {
    private static ConfigDataProvider config;
    private Properties properties;

    private ConfigDataProvider(){
        properties = new Properties();

    }
    public static ConfigDataProvider getFileInstance() throws IOException {
        if (config == null){
            config = new ConfigDataProvider();
        }
        return config;
    }

    public Properties getPropertyFile() throws IOException {
        properties.load(new FileInputStream(System.getProperty("user.dir")+"/Datas/Config.properties"));
        return properties;
    }
//    public  Properties DataProvider() {
//
//
//        Properties pro = new Properties();
//
//        try {
//            File src = new File("./Datas/Config.properties");
//            FileInputStream fis = new FileInputStream(src);
//            pro.load(fis);
//
//        } catch (Exception e) {
//            System.out.println("Not Able To Load Config File  " + e.getMessage());
//        }
//        return pro;
//    }
//
//    public Properties returnProperty(){
//
//        return DataProvider();
//    }

}
