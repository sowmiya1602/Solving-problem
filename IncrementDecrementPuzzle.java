package ictprogram;

public class IncrementDecrementPuzzle {
	public static void main(String[] args) {
        int x1 = 5;
        int result1 = x1++ + ++x1;
        System.out.println("x++ + ++x = " + result1);

        int x2 = 5;
        int result2 = x2-- - --x2;
        System.out.println("x-- - --x = " + result2);

        int x3 = 5;
        int result3 = ++x3 * x3++;
        System.out.println("++x * x++ = " + result3);
    }
}
