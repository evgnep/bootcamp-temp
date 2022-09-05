package ru.otus.oop1.ex2;

class Ex2App1 {
    public static void main(String[] args) {
        var r1 = new Rectangle();
        //r1.width = -10;
        r1.setWidth(-10);
        var square = r1.square();
        System.out.println(square);
    }
}

class Ex2App2 {
    public static void main(String[] args) {
        var r1 = new Rectangle();
        r1.setHeight(10);
        var square = r1.square();
        System.out.println(square);
    }
}
