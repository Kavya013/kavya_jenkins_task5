import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampPrinter {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Timestamp: " + formatter.format(date));
    }
}
