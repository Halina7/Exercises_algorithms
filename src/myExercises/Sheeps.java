package myExercises;/*
Given a number, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep..."
Note:
You will always receive a positive integer.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sheeps {
    public static String countingSheep1(int num) {
        StringBuilder strB = new StringBuilder();
        for(int counter=1; counter <= num; counter++){
            strB.append(counter).append(" sheep...");
        }
        return strB.toString();
    }

    public static String countingSheep2(int num) {
        return IntStream.range(1,num+1)
                .mapToObj( n -> "" + n + " sheep..." )
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(countingSheep2(4));
    }
}
