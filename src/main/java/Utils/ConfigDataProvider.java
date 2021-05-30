package Utils;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    public  Properties DataProvider() {

        Properties pro = new Properties();

        try {
            File src = new File("./Datas/Config.properties");
            FileInputStream fis = new FileInputStream(src);
            pro.load(fis);

        } catch (Exception e) {
            System.out.println("Not Able To Load Config File  " + e.getMessage());
        }
        return pro;
    }

    public Properties returnProperty(){

        return DataProvider();
    }

}
