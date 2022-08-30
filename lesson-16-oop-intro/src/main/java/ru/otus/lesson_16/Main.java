package ru.otus.lesson_16;

import ru.otus.lesson_16.models.Question;
import ru.otus.lesson_16.models.Questionnaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          инициализация сканера вводимых данных
          в качестве источника используется системный ввод System.in который является абстракцией системной консоли (ввод от клавиатуры)
         */
        Scanner sc = new Scanner(System.in);


        Questionnaire test = new Questionnaire();
        // инициализация вопросов теста
        for (int i = 1; i < 6; i++) {
            Question question = new Question("question" + i + "?", new String[]{"answer1", "answer2", "answer3", "answer4", "answer5"}, i);
            test.addQuestion(question);
        }

        // приветсвенное сообщение
        System.out.printf("""
                                                
                        Вы начали опрос. Вам предстоит ответить на %d вопросов.
                        На каждый вопрос возможен только один правильный ответ.
                        Для ответа на вопрос нажмите цифру с номером ответа который считаете верным и нажмите Enter.
                        Если хотите завершить тест досрочно введите 0 и нажмите Enter.
                                                
                        """,
                test.numberOfQuestions()
        );

        int userAnswer = 0;

        int clearPadding = 0;
        while (test.hasNextQuestion()) {
            clearPadding = 0;

            System.out.println(test.printNextQuestion());

            // вывод пользователю запроса на ввод данных
            System.out.print("введите номер варианта: > ");

            // ожидание ввода пользователя
            userAnswer = sc.nextInt();

            // проверка ответа пользователя
            while (userAnswer > test.numberOfQuestions() || userAnswer < 1) {

                // в случае если пользователь решил досрочно выйти
                if (userAnswer < 1) {
                    System.out.println("Опрос завершен. Выход...");
                    System.exit(0);
                }

                System.out.print("\u001b[" + (1 + clearPadding) + "A\u001b[J");
                System.out.flush();

                // в случае если пользователь ввел недопустимый номер ответа
                System.out.println("Введеный вариант ответа не найден в списке допустимых. Попробуйте еще раз или введите 0 для выхода из теста.");
                System.out.print("введите номер варианта: > ");
                userAnswer = sc.nextInt();
                clearPadding = 1;
            }

            test.checkAnswer(userAnswer);

            // очистка консоли перед выводом следующего вопроса
            String clearConsole = "\u001b[" + (4 + clearPadding + test.answersNumber()) + "A\u001b[J";
            System.out.println(clearConsole);
            System.out.flush();
        }

        System.out.println(test.printResult());

        System.out.println("Опрос завершен. Выход...");
    }
}