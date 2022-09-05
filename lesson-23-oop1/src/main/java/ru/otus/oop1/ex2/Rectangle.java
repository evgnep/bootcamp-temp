package ru.otus.oop1.ex2;

public class Rectangle {
    // 1 - private
    // 2 - значение по умолчанию
    private int width = 1;
    private int height = 1;

    // 3 - нам нужен "getter"
    public int getWidth() {
        return width;
    }

    // 4  нам нужен "setter"
    public void setWidth(int width) {
        // исключения (throw) будут через несколько уроков, пока считаем что это способ сообщить об ошибке и завершить программу
        if (width <= 0) throw new RuntimeException();
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) throw new RuntimeException();
        this.height = height;
    }

    public int square() {
        return width * height;
    }
}
