package ru.itis.inform;

public class RationalNumber {

    private int a;
    private int b;

    public RationalNumber(int a, int b) {
        this.a = a;
        if (b == 0) {
            throw new IllegalArgumentException();
        } else this.b = b;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
