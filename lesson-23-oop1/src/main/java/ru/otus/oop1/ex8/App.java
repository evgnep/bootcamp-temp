package ru.otus.oop1.ex8;

public class App {
    public static void main(String[] args) {
        var r = new Rectangle(10, 20);
        r.setX(10);

        var s = new Square(5);
        s.setX(20);

        System.out.println(r.getX());
        System.out.println(s.getX());
    }
}
