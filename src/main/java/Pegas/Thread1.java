package Pegas;

public class Thread1 extends Thread{
    private final String name;
    public Thread1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread1 run() method "+ "Thread name is: "+Thread.currentThread().getName() + ".His name is: "+name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 tr1 = new Thread1("Ivan");
        tr1.start();
        Thread.sleep(1000);
        Thread1 tr2 = new Thread1("Pavel");
        tr2.start();
        Thread1 tr3 = new Thread1("Petr");
        tr3.start();
    }
}
