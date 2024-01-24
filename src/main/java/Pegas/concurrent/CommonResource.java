package Pegas.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class CommonResource {
    private int x = 0;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
