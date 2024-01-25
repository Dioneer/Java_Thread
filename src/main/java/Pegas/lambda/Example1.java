package Pegas.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,18,22,44,2,4,5,6,7,8,9,2,13));
        arr.sort(Comparator.comparingInt(o -> o));
        System.out.println(arr);
        MathInter<Integer>m = ((f,s)->{
           if(f>s){
               return f;
           }
           return s;
        });
        System.out.println(m.getMax(5,25));
    }
}
