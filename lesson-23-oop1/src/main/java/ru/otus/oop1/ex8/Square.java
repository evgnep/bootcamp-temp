package ru.otus.oop1.ex8;

import java.util.HashMap;
import java.util.Map;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    // геттеры и сеттеры исключены для наглядности

    public int square() {
        return side * side;
    }
}
