package Pegas.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock lock = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource, lock));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
