package ru.otus.oop1.ex9;

public class Base {
    int x;
    public Base() {
        System.out.println("Base()");
    }

    public Base(int x) {
        this.x = x;
        System.out.println("Base(" + x + ")");
    }
}
