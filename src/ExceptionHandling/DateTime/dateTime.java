package ExceptionHandling.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

        System.out.println(parsedDate);

    }
}
