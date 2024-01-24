package Pegas.deadLock;

import java.util.concurrent.Callable;

public class DeadLock {
    record Friend(String name) {
        public synchronized void bow(Friend bower) {
                System.out.format("%s: %s " + " has bowed to me!%n", this.name, bower.name());
                bower.bowerBack(this);
            }

        public synchronized void bowerBack(Friend bower) {
                System.out.format("%s: %s " + " has bowed back to me!%n", this.name, bower.name());
            }
        }

    public static void main(String[] args) {
        final Friend fr1 = new Friend("Alfonso");
        final Friend fr2 = new Friend("Gaston");
        Runnable runnable1 = (()->{
            System.out.println("Thread 1");
            fr1.bow(fr2);
        });
        Runnable runnable2= (()->{
            System.out.println("Thread 1");
            fr2.bow(fr1);
        });
        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
