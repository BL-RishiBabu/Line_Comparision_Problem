import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter coordinates for Line 1 (x1 y1 x2 y2):");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Enter coordinates for Line 2 (x3 y3 x4 y4):");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();
        double x4 = sc.nextDouble(), y4 = sc.nextDouble();
        Double length2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        System.out.println("\nLength of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        int comparisonResult = length1.compareTo(length2);

        if (comparisonResult == 0) {
            System.out.println("Result: Both lines are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("Result: Line 1 is greater than Line 2.");
        } else {
            System.out.println("Result: Line 1 is less than Line 2.");
        }

        sc.close();
    }
}