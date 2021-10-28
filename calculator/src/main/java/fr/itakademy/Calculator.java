package fr.itakademy;

class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public int puissance(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * puissance(a, b - 1);
    }

    public double racine(int a) {
        double tmp;
        double d = a / 2;
        do {
            tmp = d;
            d = (tmp + (a / tmp)) / 2;
        } while ((tmp - d) != 0);
        return d;
    }

    public static void main(String[] args) {
        // double x = division(5.0, 0.0);
        // int y = puissance(3, 3);
        // double z = racine(2);
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);
    }
}