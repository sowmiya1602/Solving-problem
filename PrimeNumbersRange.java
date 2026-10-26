package ictprogram;

public class PrimeNumbersRange {
	public static void main(String[] args) {
        int start = 10;
        int end = 50;

        System.out.print("Prime numbers: ");
        for (int i = start; i <= end; i++) {
            if (i <= 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
