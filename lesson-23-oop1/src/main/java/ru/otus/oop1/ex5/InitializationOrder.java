package ru.otus.oop1.ex5;

public class InitializationOrder {
    boolean b = true;
    //int w = x + y + 42;
    int w = someFunc();
    int x = 5;
    int y = x + 10;
    String s = "qwer";

    {
        System.out.println("init 1");
        w += 1;
        printVars();
    }

    {
        System.out.println("init 2");
        w += 10;
        printVars();
    }

    InitializationOrder() {
        System.out.println("ctor");
        x = 100;
        printVars();
    }

    int someFunc() {
        System.out.println("init w...");
        printVars();
        return 42 + x + y;
    }

    void printVars() {
        System.out.println("   x="+x + ", y="+y + ", w=" + w + ", b=" + b + ", s="+s);
    }

    public static void main(String[] args) {
        new InitializationOrder();
    }
}
