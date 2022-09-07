package ru.otus.oop1.ex10;

public class Derived extends Base {
    int q = someFunc();
    int w = 5;

    {
        System.out.println("Derived {}");
        printVars();
    }

    Derived() {
        System.out.println("Derived()");
        printVars();
    }

    private int someFunc() {
        System.out.println("Derived q init");
        printVars();
        return 42;
    }

    public static void main(String[] args) {
        new Derived();
    }
}
