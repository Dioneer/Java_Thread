package Pegas.lockalPackage;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class CallableDateTime {
    static LocalDateTime dateTime = LocalDateTime.now();
    static EventHandler eventHandler1 = new EventHandler(dateTime.plusSeconds(5));
    static EventHandler eventHandler2 = new EventHandler(dateTime.plusSeconds(10));
    static EventHandler eventHandler3 = new EventHandler(dateTime.plusSeconds(15));
    static EventHandler eventHandler4 = new EventHandler(dateTime.plusSeconds(20));
    static EventHandler eventHandler5 = new EventHandler(dateTime.plusSeconds(25));
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> future1 = executorService.submit(eventHandler1.callable);
        Future<String> future2 = executorService.submit(eventHandler2.callable);
        Future<String> future3 = executorService.submit(eventHandler3.callable);
        Future<String> future4 = executorService.submit(eventHandler4.callable);
        Future<String> future5 = executorService.submit(eventHandler5.callable);
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());
        executorService.shutdown();
    }
}
