package ictprogram;

public class TypeCastingDemo {
	public static void main(String[] args) {
        
        int intVal = 123;
        double doubleVal = intVal; 
        System.out.println("Implicit int to double: " + doubleVal);

       
        double d = 123.78;
        int convertedInt = (int) d; 
        System.out.println("Explicit double (" + d + ") to int = " + convertedInt);
        

        
        int largeInt = 130;
        byte byteVal = (byte) largeInt;
        System.out.println("Explicit int (" + largeInt + ") to byte = " + byteVal);
       
    }
}
