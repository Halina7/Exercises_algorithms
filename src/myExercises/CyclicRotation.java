package myExercises;/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right
by one index, and the last element of the array is moved to the first place.
For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
(elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 */

public class CyclicRotation {

    public static int[] rotation(int[] a, int k){
        int lenA = a.length;
        int[] b = new int[lenA];
        for (int i = 0; i < lenA ; i++) {
            b[(i+k) % lenA] = a[(i) ];
        }
        return b;
    }

    private static void printTable(int[] table){
        for (int i = 0; i < table.length ; i++) {
            System.out.print(table[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] table = {1,2,3,4,5,6,7,8};

        printTable(table);
        table = rotation(table, 3);
        printTable(table);

    }
}
