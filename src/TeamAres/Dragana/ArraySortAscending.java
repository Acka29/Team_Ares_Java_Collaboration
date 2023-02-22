package TeamAres.Dragana;

import java.util.Arrays;

public class ArraySortAscending {

    public static int[] ascendingArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 66, 7, 0, 6};

        System.out.println("Ascending Array " + Arrays.toString(ascendingArray(arr)));
    }


}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};

 */