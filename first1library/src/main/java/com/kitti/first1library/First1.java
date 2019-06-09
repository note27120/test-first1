package com.kitti.first1library;

public class First1 {

    private int a, b, c;

    public First1() {
        a = 0;
        b = 0;
        c = 0;
    }

    public First1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int plus(int a, int b) {
        c = a + b;
        return c;
    }

    public int subtract(int a, int b) {
        c = a - b;
        return c;
    }

    public int multiply(int a, int b) {
        c = a * b;
        return c;
    }

    public int divide(int a, int b) {
        c = a / b;
        return c;
    }


}





























