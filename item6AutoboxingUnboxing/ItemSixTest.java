package com.effectivejava.tutorial.effectivejava.item6AutoboxingUnboxing;




















import java.util.ArrayList;
import java.util.List;

public class ItemSixTest {

    private static long topla() {

        long sum = 0;

        for (int i = 0 ; i < 150; i++) {
            sum+= i;
        }
        return sum;
    }
    public static void main(String[] args) {

        String kelime = new String("bikini");
        String kelime2 = "bikini";
        String kelime3 = "bikini";

        System.out.println(kelime == kelime2);
        System.out.println(kelime2 == kelime3);

        long start = System.nanoTime();
        
        topla();
        
        long end = System.nanoTime();
        long totalTime = end - start;
        System.out.println(totalTime);  // Long'la yapinca 29000, long'la yapinca 3600 nanosaniye output oldu


        // Autoboxing - Unboxing
        ArrayList<Integer> integer = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            integer.add(Integer.valueOf(i));
        }


        List<Integer> li = new ArrayList<Integer>();
        int sum2 = 0;
        for(Integer i : li) {
            if(i.intValue() % 2 == 0) {  // i.intValue()

            }
        }

        int a = 2;

        Integer fg = Integer.valueOf(a);
    }
}
