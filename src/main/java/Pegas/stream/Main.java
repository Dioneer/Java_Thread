package Pegas.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> col = Arrays.asList("a1","a2","a3","a4","a1");
        long res1= col.stream().filter("a1"::equals).count();
        System.out.println(res1);
        System.out.println(col.stream().skip(col.size()-1).findFirst().orElse("Empty"));
        System.out.println(col.stream().filter("a3"::equals).findFirst().get());
    }
}
