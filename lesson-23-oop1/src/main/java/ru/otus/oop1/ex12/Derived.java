package ru.otus.oop1.ex12;

import ru.otus.oop1.ex11.Figure;
import ru.otus.oop1.ex11.Rectangle;
import ru.otus.oop1.ex11.Square;

public class Derived extends Base {
    //@Override
    int f(int a) {
        System.out.println("Derived f(int)");
        return 0;
    }

    //@Override
    Figure g(int a, Rectangle b) {
        // Figure g(long a, Rectangle b) {
        System.out.println("Derived f(int, Rectangle)");
        return null;
    }

   // void g(int a, Rectangle b) { }

    //@Override
    Figure g(int a, Square b) {
        System.out.println("Derived f(int, Square)");
        return null;
    }

    public static void main(String[] args) {
        Rectangle r = null;
        Square s = null;

        Base d = new Derived();
        d.f(1);
        d.g(1, r);

        System.out.println("-------");

        Base b = new Base();
        b.f(1);
        b.g(1, r);
    }
}
