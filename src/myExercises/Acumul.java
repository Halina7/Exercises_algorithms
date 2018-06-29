package myExercises;/*
Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 */

public class Acumul {
    public static String accum(String s){
        char[] array = s.toCharArray();
        String result = "";
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            result += String.valueOf(array[i]).toUpperCase();
            count++;
            if(count > 1){
                for (int j = 1; j < count; j++) {
                    result += String.valueOf(array[i]).toLowerCase();
                }
            }
            if(i + 1 < array.length) {
                result += "-";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(accum("zumaki"));
    }
}
