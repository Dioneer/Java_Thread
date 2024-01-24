package Pegas.waitNotify;

public class Waiter {
    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }
    Runnable runnable = (()->{
        String name = Thread.currentThread().getName();
        synchronized (msg){
            try {
                System.out.println(name + " waiting for call notify: "+System.currentTimeMillis());
                msg.wait();
                System.out.println(name+" was call method notify: "+System.currentTimeMillis());
                System.out.println(name+" : "+ msg.msg());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });
    }
