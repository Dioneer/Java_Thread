package Pegas.waitNotify;

public class Producer {
    private Consumer consumer;
    public Producer(Consumer consumer) {
        this.consumer = consumer;
    }
    Runnable runnable = (()->{
        for (int i = 0; i < 5; i++) {
            try {
                consumer.put();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });
}
