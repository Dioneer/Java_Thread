package Pegas.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread implements Runnable{
    private final CommonResource commonResource;
    private final ReentrantLock reentrantLock;

    public CountThread(CommonResource commonResource, ReentrantLock reentrantLock) {
        this.commonResource = commonResource;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            commonResource.setX(1);
            int x = commonResource.getX();
        for (int i =1; i < 5; i++) {
            System.out.printf("%s + %d \n", Thread.currentThread().getName(), commonResource.getX());
            commonResource.setX(++x);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            reentrantLock.unlock();
        }
    }
}
