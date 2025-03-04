import java.util.Scanner;

class Employee {
    private int empCode;
    private double basicSalary;
    public Employee(int empCode, double basicSalary) {
        this.empCode = empCode;
        this.basicSalary = basicSalary;
    }
    public double calculateNetSalary() {
        double da = 1.74 * basicSalary; 
        double hra = 0.10 * basicSalary; 
        double ta = 500; 
        double incomeTax = (basicSalary > 50000) ? 0.05 * basicSalary : 0;

        return (basicSalary + da + hra + ta) - incomeTax;
    }

    
    public void displayDetails() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Code: ");
        int empCode = scanner.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Employee emp = new Employee(empCode, basicSalary);
        emp.displayDetails();
    }
}
