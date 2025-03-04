class Calculation {
    private int num1, num2;

    void setNumbers(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void operations() {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.setNumbers(20 , 10);
        calc.operations();
    }
}
