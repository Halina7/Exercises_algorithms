package myExercises;

import java.util.Arrays;
import java.util.Random;

/*
Codility
A non-empty array A consisting of N integers is given.
The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
Your goal is to find the maximal product of any triplet.
Assume that:
 - N is an integer within the range [3..100,000];
 - each element of array A is an integer within the range [−10..10].
*/
public class MaxProductOfThree {

    public static int maxProductOfThree(int A[], int n){
        Arrays.sort(A);
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.print(A[i] + "  ");
        }
        int sol1 = A[n-1]*A[n-2]*A[n-3];    // three positive numbers or three negative if table contains only negatives
        int sol2 = A[0]*A[1]*A[n-1];        // two negative and one positive numbers -
        return (sol1 > sol2 ? sol1 : sol2);
    }

    public static int distinct(int[] A, int n){
        Arrays.sort(A);
        int amount = 1;
        for (int i = 1; i < n ; i++) {
            if (A[i] != A[i-1]){
                amount++;
            };
        }
        return amount;
    }

    public static void fillTable(int A[], int N){
        for (int i = 0; i <N ; i++) {
            Random rand = new Random();
            A[i] = rand.nextInt(19) - 10;
        }
        for (int i = 0; i < N ; i++) {
            System.out.print(A[i] + "  ");
        }
    }

    public static void main(String[] args) {
        final int N = 5;
        int[] array = new int[N];
        fillTable(array,N);
        System.out.println("maxProductOfThree: " + maxProductOfThree(array, N));
        System.out.println("Amount of distinct numbers in array: " + distinct(array, N));
    }
}
