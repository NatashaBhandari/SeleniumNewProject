package SeleniumJavaAmazon;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {

    public static void waitForElement(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";
        String value = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            value = properties.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
