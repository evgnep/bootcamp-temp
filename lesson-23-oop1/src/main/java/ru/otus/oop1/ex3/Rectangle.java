package ru.otus.oop1.ex3;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    // геттеры и сеттеры исключены для наглядности

    public int square() {
        return width * height;
    }

    public static void main(String[] args) {
        //var r = new Rectangle();
        var r = new Rectangle(10,20);
        System.out.println(r.square());
    }
}
