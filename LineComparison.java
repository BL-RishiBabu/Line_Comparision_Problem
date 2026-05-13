import java.util.Scanner;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> {
    Point p1, p2;
    Double length;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.length = calculateLength();
    }

    private double calculateLength() {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return this.length.equals(line.length);
    }

    @Override
    public int compareTo(Line other) {
        return this.length.compareTo(other.length);
    }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program using OOP");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter coordinates for Line 1 (x1 y1 x2 y2):");
        Line line1 = new Line(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));

        System.out.println("Enter coordinates for Line 2 (x3 y3 x4 y4):");
        Line line2 = new Line(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));

        System.out.println("\nLength of Line 1: " + line1.length);
        System.out.println("Length of Line 2: " + line2.length);

        if (line1.equals(line2)) {
            System.out.println("Result: Both lines are equal.");
        } else {
            int res = line1.compareTo(line2);
            if (res > 0) {
                System.out.println("Result: Line 1 is greater than Line 2.");
            } else {
                System.out.println("Result: Line 1 is less than Line 2.");
            }
        }

        sc.close();
    }
}