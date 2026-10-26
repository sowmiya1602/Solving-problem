package ictprogram;

public class LargestOfThree {
	public static void main(String[] args) {
        int n1 = 25;
        int n2 = 78;
        int n3 = 42;

        
        int largestIf;
        if (n1 >= n2 && n1 >= n3) {
            largestIf = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largestIf = n2;
        } else {
            largestIf = n3;
        }
        System.out.println("Largest (Nested if-else): " + largestIf);

        
        int largestTernary = (n1 >= n2) ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        System.out.println("Largest (Ternary operator): " + largestTernary);
    }
}
