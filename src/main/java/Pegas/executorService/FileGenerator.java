package Pegas.executorService;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.concurrent.*;

public class FileGenerator {
    Callable<List<String>> callable = (()->{
        String threadName = Thread.currentThread().getName();
        List<String> file = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            String fileName = threadName+"_"+i+".txt";
            file.add(fileName);
            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(fileName));
            bos.write(("Java for me " +i).getBytes());
            bos.flush();

        }
        Thread.sleep(1000);
        return file;
    });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> future = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Future<List<String>> items = executorService.submit(new FileGenerator().callable);
            future.add(items);
        }
        List<String> result = new ArrayList<>();
        for (Future<List<String>> f : future){
            result.add(String.valueOf(f.get()));
        }
        System.out.println(result);
        executorService.shutdown();
    }
}
