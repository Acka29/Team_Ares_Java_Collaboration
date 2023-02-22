package TeamAres.Dragana;

import java.util.Arrays;

public class ArraySortDescending {

    public static int[] descendingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {


        int[] arr = {1, 8, 66, 7, 0, 6};

        System.out.println("Descending Array " + Arrays.toString(descendingArray(arr)));
    }

}
/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */