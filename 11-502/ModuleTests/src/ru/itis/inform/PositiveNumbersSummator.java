package ru.itis.inform;


public class PositiveNumbersSummator {

    public int summ(int a, int b) {
        if (a >= 0 && b >= 0) {
            return a + b;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

