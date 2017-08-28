package se.su.it.itslearning.integration.wsclient.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lhagr on 2017-08-28.
 */
public class WsConfig {

    private Properties properties;

    public String getUser() {
        return getProperties().getProperty("user");
    }

    public String getPwd() {
        return getProperties().getProperty("pwd");
    }

    public Properties getProperties() {
        if (this.properties == null) {
            InputStream resourceAsStream = this.getClass().getResourceAsStream("/itslearningwsconfig.properties");
            this.properties = new Properties();
            try {
                this.properties.load(resourceAsStream);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("", e);
            }
        }
        return properties;
    }
}
