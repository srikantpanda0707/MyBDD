package Utils;

import java.io.IOException;

public class PropertyReader {


    public static String getProperty(String key) {
        try {
            return ConfigDataProvider
                    .getFileInstance()
                    .getPropertyFile()
                    .getProperty(key.toLowerCase());
        } catch (IOException e) {
            throw new Exception(e.getLocalizedMessage());
        }

    }

}
