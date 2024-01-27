package Pegas.waitNotify;

import java.util.ArrayList;

public class WorkerThread {
    public static void main(String[] args) {
        BlockingQueue bq = new BlockingQueue();
        Thread worker = new Thread(()->{
            while (true){
                Runnable task = bq.get();
                task.run();
            }
        });
        worker.start();
        bq.put(getTask());
        bq.put(getTask());
        bq.put(getTask());
    }
    public static Runnable getTask(){
        return (() -> {
            System.out.println("Task started: " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Task finished: " + Thread.currentThread().getName());
        });
    }
    public static class BlockingQueue{
        ArrayList<Runnable> tasks = new ArrayList<>();
        public synchronized Runnable get(){
            while (tasks.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }
        public synchronized void put(Runnable task){
            tasks.add(task);
            notify();
        }
    }

}
