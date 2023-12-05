
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Internationalization {

    public static void display(String language, String country) {
        try {
            Locale locale = new Locale(language, country);
            int num = 123456;
            NumberFormat nm = NumberFormat.getInstance(locale);
            System.out.println("Number Format: " + nm.format(num));
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("Date Format: " + df.format(new Date()));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        display("en", "US");
        System.out.println("==========================");
        display("en", "UK");
        System.out.println("==========================");
        display("ja", "JP");
        System.out.println("==========================");
        display("fr", "FR");
    }
}