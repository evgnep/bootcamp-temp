package ru.otus.lesson_16.models;

public class Question {
    private final String question;
    private final String[] answers;

    private final int validAnswer;

    public Question(String question, String[] answers, int validAnswer) {
        this.question = question;
        this.answers = answers;
        this.validAnswer = validAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        String[] response = new String[answers.length];
        for (int i = 0; i < answers.length; i++) {
            response[i] = answers[i];
        }
        return response;
    }

    public boolean isValidAnswer(int answer) {
        return answer == validAnswer;
    }
}
