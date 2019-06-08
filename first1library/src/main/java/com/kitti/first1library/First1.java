package com.kitti.first1library;

class First1 {

    private int a, b, c;

    First1() {
        a = 0;
        b = 0;
        c = 0;
    }

    First1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    int getB() {
        return b;
    }

    void setB(int b) {
        this.b = b;
    }

    int getC() {
        return c;
    }

    void setC(int c) {
        this.c = c;
    }

    int plus(int a, int b) {
        c = a + b;
        return c;
    }

    int subtract(int a, int b) {
        c = a - b;
        return c;
    }

    int multiply(int a, int b) {
        c = a * b;
        return c;
    }

    int divide(int a, int b) {
        c = a / b;
        return c;
    }


}





























