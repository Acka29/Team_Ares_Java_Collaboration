package TeamAres.Dragana;

import java.util.Arrays;

public class ArrayFindMaximum {

    public static void main(String[] args) {



        int[] arr = {10, 13, 100, 156, 1, 5, 0};

        System.out.println("Maximum number in this array is: " + maximum(arr));

    }

    public static int maximum(int[] arr){

        int max = arr[0];

       for (int i = 0; i < arr.length; i++) {
           if(max < arr[i]){
               max = arr[i];
            }
         }

        return max;


    }



}
/*
Question1: Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */