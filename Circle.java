import java.util.Scanner;
class Circle {
    private double radius;
    private final double PI = 3.14;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle();
        c.setRadius(r);
        System.out.println("Area of Circle: " + c.getArea());
    }
}