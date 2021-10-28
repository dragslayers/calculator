class calculator {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a + b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static int puissance(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a * puissance(a, b--);
    }

    public static void main(String[] args) {
        double x = division(5.0, 2.0);
        System.out.println(x);
    }
}