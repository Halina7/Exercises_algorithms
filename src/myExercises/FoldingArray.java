package myExercises;/*
You have to write a method that folds a given array of integers by the middle x-times.
Fold 1-times:  [1,2,3,4,5] -> [6,6,3]
Fold 2-times:  [1,2,3,4,5] -> [9,6]
If the count of numbers is odd, the middle number will stay. Otherwise the fold-point is between the middle-numbers,
so all numbers would be added in a way.
The array will always contain numbers and will never be null.
The parameter runs will always be a positive integer greater than 0 and says how many runs of folding your method has to do.
If an array with one element is folded, it stays as the same array.
The input array should not be modified!
 */

public class FoldingArray {
    public static int[] foldArray(int[] array, int runs) {
        int[] result = array;
        int middle = result.length;
        for (int i = 0; i < runs; i++) {
            if ((middle % 2) == 0) {
                middle = result.length / 2;
                int[] r = new int[middle];
                for (int j = 0, k = result.length - 1; j < middle; j++, k--) {
                    r[j] = result[j] + result[k];
                }
                result = r;
            }else {
                middle = result.length / 2;
                int[] r = new int[middle+1];
                for (int j = 0, k = result.length - 1; (j <= middle ); j++, k--) {
                    if(j == middle){
                        r[j] = result[j];
                    }else{
                        r[j] = result[j] + result[k];
                    }
                }
                result = r;
            }
            middle = result.length;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,3,4,5,6};

        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int item : foldArray(a,3)) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}