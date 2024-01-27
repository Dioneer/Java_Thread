package Pegas.runnable;

public class Runnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by "+Thread.currentThread().getName()+" , i is "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new Thread(new Runnable2());
        tr1.start();
        tr1.join();
        Thread tr2 = new Thread(new Runnable2());
        tr2.start();
        Thread tr3 = new Thread(new Runnable2());
        tr3.start();
    }
}
