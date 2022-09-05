package ru.otus.oop1.ex8;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // геттеры и сеттеры исключены для наглядности

    public int square() {
        return width * height;
    }
}
