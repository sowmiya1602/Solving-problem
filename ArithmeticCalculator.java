package ictprogram;

public class ArithmeticCalculator {
	public static void main(String[] args) {
        int num1 = 17;
        int num2 = 5;

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Diff = " + Math.abs(num1 - num2));
        System.out.println("Prod = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quot = " + (num1 / num2));
            System.out.println("Rem = " + (num1 % num2));
        } else {
            System.out.println("Quot = Division by zero is undefined.");
            System.out.println("Rem = Division by zero is undefined.");
        }
    }
}
