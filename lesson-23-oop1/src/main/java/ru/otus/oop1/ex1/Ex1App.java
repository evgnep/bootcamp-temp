package ru.otus.oop1.ex1;

public class Ex1App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 10;
        r1.height = 20;
        var square = r1.square();
        System.out.println(square);
    }
}
