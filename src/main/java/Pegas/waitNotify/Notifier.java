package Pegas.waitNotify;

public class Notifier {
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }
    public Runnable runnable = (()->{
        String name = Thread.currentThread().getName();
        System.out.println(name+" start");
        try {
            Thread.sleep(1000);
            synchronized (msg){
                System.out.println("thread Notifier worked "+ msg.msg());
                msg.notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
}
