import java.util.Scanner;
class Student {
    int studId, sem;
    String name, branch;

    void setDetails(int id, String n, int s, String b) {
        studId = id;
        name = n;
        sem = s;
        branch = b;
    }

    void display() {
        System.out.println("Student ID: " + studId);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        Student s = new Student();
        s.setDetails(id, name, sem, branch);
        s.display();
    }
}