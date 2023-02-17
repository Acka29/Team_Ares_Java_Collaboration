package Ali;

public class Task3Solution_FINRA {

    public static void printFinraNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {

        printFinraNumbers();


    }
}
/*
Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print
 "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers
 which are a multiple of 5, print "RA" instead of the number.
 */