package ictprogram;

public class FibonacciAndFactorial {
	public static void main(String[] args) {
        int n = 8;
        long t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            long nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.println();

        int num = 5;
        long factorial = 1;
        int i = 1;
        
        if (num > 0) {
            do {
                factorial *= i;
                i++;
            } while (i <= num);
        }
        System.out.println("Factorial = " + factorial);
    }
}
