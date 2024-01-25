package Pegas.lockalPackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class EventHandler {
    private LocalDateTime eventDate;
    public EventHandler(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
    Callable<String> callable=(()->{
        long d = 0;
        while ((d = Duration.between(LocalDateTime.now(),eventDate).toSeconds())>0){
            System.out.println("Event: " + Thread.currentThread().getName()+" will be started in "+d+" seconds");
            Thread.sleep(1000);
        }
        return "Event: " + Thread.currentThread().getName()+" started";
    });
}
