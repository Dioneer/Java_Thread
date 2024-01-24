package Pegas.waitNotify;

public class NoObjectForSynchronized {
    private final Object object = new Object();
    Runnable runnable1 = (()->{
    synchronized (object){
        System.out.println("T1 start!");
        try {
            object.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T1 end");
    }
    });
    Runnable runnable2 = (()->{
        synchronized (object){
            System.out.println("T2 start!");
            object.notify();
            System.out.println("T2 end!");
        }
    });
}
