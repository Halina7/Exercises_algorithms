package myExercises;/*
Create a function called that accepts 2 string arguments and returns an integer of the count of occurrences
the 2nd argument is found in the first one.
If no occurrences can be found, a count of 0 should be returned.
strCount("Hello", 'o') // => 1
strCount("Hello", 'l') // => 2
strCount("", 'z') // => 0
Notes:
The first argument can be an empty string
The second string argument will always be of length 1
 */

public class CodeWars {
    public static int strCount1(String str, char letter) {
        char[] array = str.toCharArray();
        int amount = 0;
        if (str.isEmpty()){
            return 0;
        }else {
            for(char c: array){
                if(c == letter){
                   amount++;
                }
            }
        }
        return amount;
    }

    public static int strCount2(String str, char letter) {
        return (int)str.chars().filter( value -> value == letter).count();
    }

    public static void main(String[] args) {
        System.out.println(strCount1("Hello", 'o'));
        System.out.println(strCount1("Hello", 'l'));
        System.out.println(strCount2("Hello", 'o'));
        System.out.println(strCount2("Hello", 'l'));
    }
}
