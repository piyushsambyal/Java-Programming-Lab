import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            Area rectangle = new Area(length, breadth);
            System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values for length and breadth.");
        } finally {
            scanner.close();
        }
    }
}
