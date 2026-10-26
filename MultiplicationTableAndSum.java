package ictprogram;

public class MultiplicationTableAndSum {
	public static void main(String[] args) {
        int n = 7;

        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        int temp = Math.abs(n);
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
