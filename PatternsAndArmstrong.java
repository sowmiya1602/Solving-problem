package ictprogram;

public class PatternsAndArmstrong {
	public static void main(String[] args) {
        int n = 5;

        System.out.println("Right-angled star pattern (Odd rows only):");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Inverted number pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int number = 153;
        int original = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
