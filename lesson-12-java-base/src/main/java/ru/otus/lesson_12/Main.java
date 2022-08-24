package ru.otus.lesson_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          инициализация сканера вводимых данных
          в качестве источника используется системный ввод System.in который является абстракцией системной консоли (ввод от клавиатуры)
         */
        Scanner sc = new Scanner(System.in);

        // инициализация вопросов теста
        questions = ...;

        // инициализация вариантов ответов для вопросов теста
        answers = ...;

        // инициализация списка правильных ответов на вопросы теста
        validAnswers = ...;

        //TODO

        // формирование значений для вывода результатов теста
        String result = ...;

        // вывод результатов тестирования
        System.out.printf("Результат: тест \"%s\".%n", result);

        System.out.println("Опрос завершен. Выход...");
    }
}