package myExercises;/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.

For example:
 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit
 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2
 persistence(4) == 0 // because 4 is already a one-digit number
 */

public class Persist {
    public static int persistence(long n) {

        int result = 0;
        String number = String.valueOf(n);
        int length = number.length();

        if(length == 1){
            return result;
        }

        while (length > 1) {
            char[] digits = number.toCharArray();
            long multi = 1;

            for (int i = 0; i < length; i++) {
                multi = multi * Integer.parseInt(String.valueOf(digits[i]));
            }
            result++;
            number = String.valueOf(multi);
            length = number.length();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }
}
