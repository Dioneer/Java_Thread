package Pegas;

public class Runnable1 implements Runnable{
    private final String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("run() "+ this.name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new Thread(new Runnable1("Igor"));
        tr1.start();
        Thread.sleep(1000);
        Thread tr2 = new Thread(new Runnable1("Dima"));
        tr2.start();
        Thread tr3 = new Thread(new Runnable1("Borya"));
        tr3.start();
    }
}
