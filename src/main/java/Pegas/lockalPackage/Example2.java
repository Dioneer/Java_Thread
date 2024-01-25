package Pegas.lockalPackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(1989,03, 17, 12,10,35 );
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(date2.minusYears(date1.getYear()).getYear());
        System.out.println(Duration.between(date2,date1).toDays());

    }
}
