package app;

import org.apache.commons.logging.LogFactory;
import services.QuanGuoGGZYService;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        // 去掉烦人的日志
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http.client").setLevel(Level.OFF);

        QuanGuoGGZYService service = new QuanGuoGGZYService();
        service.getTender();

    }
}
