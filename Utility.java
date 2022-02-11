package MVC;

import MVC.Continual;
import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utility {

    public static String obtainProperties(String key) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("app.properties"));
            return properties.getProperty(key);
        } catch (Exception e) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

   }


