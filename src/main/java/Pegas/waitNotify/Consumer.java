package Pegas.waitNotify;

public class Consumer {
    private int item;
    public synchronized void put() throws InterruptedException {
        while (item>3){
            wait();
        }
        item++;
        System.out.println("Producer add 1 item. Now in stock: "+item+" items.");
        notify();
    }
    public synchronized void get() throws InterruptedException {
        while (item<1){
            wait();
        }
        item--;
        System.out.println("Customer get 1 item. Now in stock: "+item+" items.");
        notify();
    }
}
