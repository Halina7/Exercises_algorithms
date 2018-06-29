package myExercises;/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
and each element of the array can be paired with another element that has the same value,
except for one element that is left unpaired.
For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.

A function with given an array A consisting of N integers fulfilling the above conditions,
returns the value of the unpaired element.
 */

public class OddOccurrencesInArray {

    private static int solution(int a[], int n) {
        int alone = -1;
        int[] tempTable = new int[n/2];
        int indexTemp = 0;

        for (int i = 0; i < n; i++) {

            alone = a[i];
            int amount = 1;
            boolean isInTable = false;

            if((tempTable[0] != 0)){
                for (int k = 0; (k < tempTable.length)&&(!isInTable) ; k++) {
                    if(tempTable[k] == alone){
                        isInTable = true;
                    }
                }
            }

            if (!isInTable) {
                for (int j = i + 1; j < n; j++) {
                    if (alone == a[j]) {
                        amount++;
                    }
                }
                if ((amount % 2) == 0) {
                    tempTable[indexTemp] = alone;
                    indexTemp++;
                } else {
                    return alone;
                }
            }
        }
        return alone;
    }

    private static void printTable(int[] table){
        for (int i: table) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] table = {9,3,9,3,9,7,9,7, 1};
        int n = table.length;
        printTable(table);
        System.out.println(solution(table, n));
    }
}