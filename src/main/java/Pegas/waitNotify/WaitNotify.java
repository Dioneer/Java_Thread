package Pegas.waitNotify;

public class WaitNotify {
    public static void main(String[] args) {
//        Message message = new Message("Hi");
//        Waiter waiter1 = new Waiter(message);
//        new Thread(waiter1.runnable).start();
//        Waiter waiter2 = new Waiter(message);
//        new Thread(waiter2.runnable).start();
//        Notifier notifier1 = new Notifier(message);
//        new Thread(notifier1.runnable).start();
//        Notifier notifier2 = new Notifier(message);
//        new Thread(notifier2.runnable).start();
        //================================================================================================
//        NoObjectForSynchronized nos = new NoObjectForSynchronized();
//        new Thread(nos.runnable1).start();
//        new Thread(nos.runnable2).start();
        //================================================================================================
        Thread myThread1 = new Thread(new Homework1().runnable);
        myThread1.start();
        Thread myThread2 = new Thread(new Homework1().runnable);
        myThread2.start();
    }
}
