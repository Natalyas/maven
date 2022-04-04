package necto.random.test;


import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Properties props = System.getProperties();
        Set<String> keys = props.stringPropertyNames();
        Iterator var3 = keys.iterator();

        while (var3.hasNext()) {
            String key = (String) var3.next();
            System.out.println(key + " : " + props.getProperty(key));
        }

    }
}

