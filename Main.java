import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String toParse = "2023-03-01T13:00:00Z";
        OffsetDateTime date1 = dateTime(toParse);

        String toBeParsed = "2024-03-01T13:00:00Z";
        OffsetDateTime date2 = dateTime(toBeParsed);

        System.out.println("data 1: " + date1 +";\n" + "data 2: " + date2 + ";");
        System.out.println(isBefore(date1,date2));
        System.out.println(isAfter(date1,date2));
        System.out.println(isEqualToday(date1, date2));

    }

    public static OffsetDateTime dateTime (String string) {
        OffsetDateTime dateAndTime = OffsetDateTime.parse(string);
        return dateAndTime;
    }

   public static String isBefore (OffsetDateTime dateTime, OffsetDateTime dateTime2){
        boolean bef = dateTime.isBefore(dateTime2);
        return "la prima data è precedente alla seconda? " + bef;
   }

   public static String isAfter (OffsetDateTime dateTime, OffsetDateTime dateTime2){
        boolean aft = dateTime2.isAfter(dateTime);
        return "la seconda data è successiva alla prima? " + aft;
   }

    public static String isEqualToday (OffsetDateTime dateTime, OffsetDateTime dateTime2) {
        OffsetDateTime today = OffsetDateTime.now();
        boolean equal = dateTime.isEqual(today) && dateTime2.isEqual(today);
        return "le due date son uguali a quella di oggi (" + today.format(DateTimeFormatter.ofPattern("dd MMM yy")) + ")? " + equal;
    }
}
