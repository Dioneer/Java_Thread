package Pegas.executorService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample2 {
    private String name;
    public CallableExample2(String name) {
        this.name = name;
    }
    Callable<Integer> callable =(()->{
        System.out.println(Thread.currentThread().getName() + " ,length: "+name.length());
        return name.length();
    });

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        ExecutorService poll = Executors.newFixedThreadPool(10);
        Set<Future<Integer>> set= new HashSet<>();
        for(String st: str){
             Future<Integer> future= poll.submit(new CallableExample2(st).callable);
             set.add(future);
        }
        int sum = 0;
        for(Future<Integer> item: set){
            sum+=item.get();
        }
        System.out.printf("The sum of length is %s%n", sum);
        poll.shutdown();
    }
}
