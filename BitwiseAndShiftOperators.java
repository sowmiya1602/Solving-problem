package ictprogram;

public class BitwiseAndShiftOperators {
	public static void main(String[] args) {
        int a = 12, b = 10;

        System.out.println("12 & 10 = " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
        System.out.println("12 | 10 = " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
        System.out.println("12 ^ 10 = " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("~12 = " + (~a) + " (" + Integer.toBinaryString(~a) + ")");
        System.out.println("12 << 2 = " + (a << 2) + " (" + Integer.toBinaryString(a << 2) + ")");
        System.out.println("12 >> 2 = " + (a >> 2) + " (" + Integer.toBinaryString(a >> 2) + ")");
        System.out.println("12 >>> 2 = " + (a >>> 2) + " (" + Integer.toBinaryString(a >>> 2) + ")");
    }
}
