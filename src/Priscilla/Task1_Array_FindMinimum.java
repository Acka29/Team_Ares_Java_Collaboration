package Priscilla;

public class Task1_Array_FindMinimum {

public static int minValue(int[] n){
    int min = Integer.MAX_VALUE;

    for (int each : n){
        if(each < min){
            min = each;
        }
    }
    return min;
}

    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
}
