package ictprogram;

public class DataTypeRanges {
	public static void main(String[] args) {
        System.out.println("Byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
        System.out.println("Short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
        System.out.println("Integer: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
        System.out.println("Long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
        System.out.println("Float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
        System.out.println("Double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " + maxInt);
        System.out.println("Overflow result (Integer.MAX_VALUE + 1): " + (maxInt + 1)); 
       
    }
}

