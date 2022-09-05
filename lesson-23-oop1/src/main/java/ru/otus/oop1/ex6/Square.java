package ru.otus.oop1.ex6;

import java.util.HashMap;
import java.util.Map;

public class Square {
    private static final Map<Integer, Integer> squareCache = new HashMap<>();
    private int side;

    public Square(int side) {
        this.side = side;
    }

    // геттеры и сеттеры исключены для наглядности

    public int square() {
        return squareCache.computeIfAbsent(side, it -> {
            System.out.println("calculate... " + side);
            return side * side;
        });
    }

    public static void main(String[] args) {
        var a = new Square(10);
        System.out.println(a.square());

        var b = new Square(10);
        System.out.println(b.square());

        var c = new Square(15);
        System.out.println(c.square());
    }
}
