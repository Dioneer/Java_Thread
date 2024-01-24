package Pegas.waitNotify;

public class Homework1 {
    private int count;
    private static int globalCounter;
    Runnable runnable=(()->{
        while (count<20){
            count++;
            globalCounter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(count + Thread.currentThread().getName() + " Global counter: " +globalCounter);
        }
    });
}
