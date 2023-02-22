package ajsa;

public class Task2Solution_DivideWithoutOperator {
    public static void main(String[] args) {

        divide(10, 3);
        divide(20, 3);
    }

    /**
     * Numbers Divide without/operator
     * Write a method that can divide two numbers without using
     * division operator.
      * @param num1
     * @param num2
     */

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }


}
