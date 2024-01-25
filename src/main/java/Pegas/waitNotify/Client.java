package Pegas.waitNotify;

public class Client {
    private Consumer consumer;
    public Client(Consumer consumer) {
        this.consumer = consumer;
    }
    Runnable runnable = (()->{
        for (int i = 0; i < 5; i++) {
            try {
                consumer.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });
}
