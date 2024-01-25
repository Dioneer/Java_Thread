package Pegas.executorService;

import java.util.concurrent.*;

public class ExecutorExample {
    static ExecutorService pool = Executors.newFixedThreadPool(2);
    static Future<String> task = pool.submit(new CallableExample("ERROR"));

    public static void main(String[] args) {
        while(!task.isDone()){
            try {
                Thread.sleep(1);
                System.out.println(task.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.shutdown();
    }
}
