public class jdk {  
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("a number");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit: " + sum);
    }
}

