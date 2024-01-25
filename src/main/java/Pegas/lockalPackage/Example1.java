package Pegas.lockalPackage;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
        System.out.println(today.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDate spesifiDate = LocalDate.of(2017,02,22);
        System.out.println(spesifiDate);
        LocalDate constDate = LocalDate.ofEpochDay(0);
        System.out.println(constDate);
        LocalDate dat25022017 = LocalDate.ofYearDay(2017,250);
        System.out.println(dat25022017);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime spesificTime = LocalTime.of(23,15,11,22);
        System.out.println(spesificTime);
        LocalTime spec2000 = LocalTime.ofSecondOfDay(2000);
        System.out.println(spec2000);
        LocalDateTime lDT = LocalDateTime.now();
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(now.format(DateTimeFormatter.ofPattern("d::MM::uuuu'T'HH::mm::ss")));
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDateTime randDate = LocalDateTime.of(2017,06,9,11,6,11);
        LocalDateTime base = LocalDateTime.ofEpochSecond(2000,0, ZoneOffset.UTC);
        System.out.println("lDT "+lDT+" now "+now+" randDate "+randDate+" base "+base);
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time2 = LocalTime.now(zone1);
        System.out.println(time2);
        Instant timestamp = Instant.now();
        System.out.println(timestamp);
    }
}
