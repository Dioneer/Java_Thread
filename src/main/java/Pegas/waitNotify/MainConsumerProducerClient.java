package Pegas.waitNotify;

public class MainConsumerProducerClient {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer(consumer);
        Client client = new Client(consumer);
        new Thread(producer.runnable).start();
        new Thread(client.runnable).start();
    }
}
