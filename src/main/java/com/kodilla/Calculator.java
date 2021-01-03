package com.kodilla;

public class Calculator {

    private final double a;
    private final double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double add() {
        return getA() + getB();
    }

    public double subtract() {
        return getA() - getB();
    }

    public static void main(String[] args) {
        System.out.println(new Calculator(10,5).add());
        System.out.println(new Calculator(10,5).subtract());
    }
}
