package ru.otus.oop1.ex10;

public class Base {
    int x = someFunc();
    int y = 5;

    {
        System.out.println("Base {}");
        printVars();
    }

    Base() {
        System.out.println("Base()");
        printVars();
    }

    private int someFunc() {
        System.out.println("Base x init");
        printVars();
        return 42;
    }

    public void printVars() {
        var d = (Derived)this;
        System.out.printf("  x=%d, y=%d, q=%d, w=%d%n", d.x, d.y, d.q, d.w);
    }
}
