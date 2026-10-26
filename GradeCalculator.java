package ictprogram;

public class GradeCalculator {
	public static void main(String[] args) {
        int marks = 82;

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
