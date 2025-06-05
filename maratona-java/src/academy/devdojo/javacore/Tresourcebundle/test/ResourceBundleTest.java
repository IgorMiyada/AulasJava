package academy.devdojo.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en","US"));
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodMorning"));
        System.out.println(bundle.getString("hi"));
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(bundleBR.getString("hello"));
        System.out.println(bundle.getString("hi"));
    }
}
