package ru.otus.oop1.ex11;

public class App {
    public static Figure figureWithMaxSquare(Figure a, Figure b) {
        return a.square() > b.square() ? a : b;
    }

    public static void main(String[] args) {
        var r = new Rectangle(10, 20);
        var s = new Square(15);
        System.out.println(figureWithMaxSquare(r, s));
    }
}
