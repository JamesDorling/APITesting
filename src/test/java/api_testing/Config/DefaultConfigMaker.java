package api_testing.Config;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DefaultConfigMaker {

    public static void createDefaultConfig() {
        Properties properties = new Properties();
        try {
            properties.setProperty("api_key", "");

            properties.store(new FileWriter("src/test/resources/config.properties"), null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}