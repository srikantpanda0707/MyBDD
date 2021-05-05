package Utils;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    Properties pro;
    public void DataProvider() {

        try {
            File src = new File("./Datas/Config.properties");
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);

        } catch (Exception e) {
            System.out.println("Not Able To Load Config File  "+e.getMessage());
        }

    }

    public String GetUrl(String data){
        return pro.getProperty(data);
    }

}
