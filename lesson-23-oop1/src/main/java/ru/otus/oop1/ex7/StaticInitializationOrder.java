package ru.otus.oop1.ex7;

public class StaticInitializationOrder {
    static boolean b = true;
    //int w = x + y + 42;
    static int w = someFunc();
    static int x = 5;
    static int y = x + 10;
    static String s = "qwer";

    static {
        System.out.println("init 1");
        w += 1;
        printVars();
    }

    static {
        System.out.println("init 2");
        w += 10;
        printVars();
    }

    static int someFunc() {
        System.out.println("init w...");
        printVars();
        return 42 + x + y;
    }

    static void printVars() {
        System.out.println("   x="+x + ", y="+y + ", w=" + w + ", b=" + b + ", s="+s);
    }

    public static void main(String[] args) {

    }
}
