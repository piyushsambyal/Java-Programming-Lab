import java.util.Scanner;

class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter Minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Enter Seconds: ");
        int seconds = sc.nextInt();
        sc.close();
        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total Seconds: " + totalSeconds);
    }
}
