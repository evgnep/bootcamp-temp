package ru.otus.lesson_16.models;

public class ResultStatistics {
    private boolean successed = true;
    private int[] validAnswers;
    private int[] invalidAnswers;

    public ResultStatistics() {
        this.validAnswers = new int[0];
        this.invalidAnswers = new int[0];
    }

    public void addResult(int question, boolean result) {
        if (result) {
            addValidAnswer(question);
        } else {
            addInvalidAnswer(question);
        }
    }

    public String printResult() {
        String result = "сдан";
        StringBuilder statisticsBuilder = new StringBuilder();
        if (!successed) {
            statisticsBuilder.append("Вы не верно ответили на вопросы");
            result = "не сдан";
        }
        for (int i = 0; i < invalidAnswers.length; i++) {
            statisticsBuilder.append(" ").append(i + 1);
            if (i < invalidAnswers.length - 1) {
                statisticsBuilder.append(",");
            }
        }

        return "Результат: тест \"" + result + "\". " + statisticsBuilder + "\n";
    }

    private void addInvalidAnswer(int question) {
        successed = false;

        int[] answers = new int[this.invalidAnswers.length + 1];
        int i = 0;
        for (; i < this.invalidAnswers.length; i++) {
            answers[i] = this.invalidAnswers[i];
        }
        answers[i] = question;
        this.invalidAnswers = answers;
    }

    private void addValidAnswer(int question) {
        int[] answers = new int[this.validAnswers.length + 1];
        int i = 0;
        for (; i < this.validAnswers.length; i++) {
            answers[i] = answers[i];
        }
        answers[i] = question;
        this.validAnswers = answers;
    }
}
