package Pegas.executorService;

import java.util.concurrent.Callable;

public record CallableExample(String name) implements Callable<String> {
    @Override
    public String call() throws Exception {
        return name;
    }
}
