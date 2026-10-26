package ictprogram;
import java.util.Scanner;
public class SwapNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);

        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("(a) After temp swap: a = " + a + ", b = " + b);

        
        temp = a; a = b; b = temp;

       
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("(b) After arithmetic swap: a = " + a + ", b = " + b);

        
        a = a + b; b = a - b; a = a - b;

        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("(c) After XOR swap: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}

