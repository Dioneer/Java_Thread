package Pegas.ThreadExample;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("ThreadClass run() method"+"Thread name is: "+this.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.start();
        Thread.sleep(10);
        ThreadExample threadExample2 = new ThreadExample();
        threadExample2.start();
        ThreadExample threadExample3 = new ThreadExample();
        threadExample3.start();
    }
}
