package ru.otus.oop1.ex9;

public class Derived1 extends Base {
    int x;
    public Derived1() {
       //super();
        System.out.println("Derived1()");
    }

    public Derived1(int x) {
        super(x);
        System.out.println("Derived1(" + x + ")");
        this.x = 42;
    }

    public int get() {
        return super.x + x;
    }

    public static void main(String[] args) {
        new Derived1();
        System.out.println("-----------");
        new Derived1(10);
    }
}
