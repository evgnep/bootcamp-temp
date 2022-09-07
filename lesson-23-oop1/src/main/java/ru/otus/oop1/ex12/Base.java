package ru.otus.oop1.ex12;

import ru.otus.oop1.ex11.Figure;
import ru.otus.oop1.ex11.Rectangle;

public class Base {
    int f(int a) {
        System.out.println("Base f(int)");
        return 0;
    }

    Figure g(int a, Rectangle b) {
        System.out.println("Base g(int, Rectangle)");
        return null;
    }
}
