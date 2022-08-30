package ru.otus.lesson_16.models;

public class Questionnaire {
    private Question[] questions;
    private int questionNumber;

    private ResultStatistics statistics;

    public Questionnaire() {
        this.questions = new Question[0];
        this.statistics = new ResultStatistics();
    }

    public int numberOfQuestions() {
        return questions.length;
    }

    public void addQuestion(Question question) {
        Question[] questions = new Question[this.questions.length + 1];
        int i = 0;
        for (; i < this.questions.length; i++) {
            questions[i] = this.questions[i];
        }
        questions[i] = question;
        this.questions = questions;
    }

    public boolean hasNextQuestion() {
        return questionNumber < questions.length;
    }

    public int answersNumber() {
        return questions[questionNumber - 1].getAnswers().length;
    }

    public String printNextQuestion() {
        if (!hasNextQuestion()) {
            return "";
        }

        Question question = questions[questionNumber];
        StringBuilder builder = new StringBuilder();

        builder.append("Вопрос ").append(questionNumber + 1).append(" - ").append(question.getQuestion()).append("\n");

        String[] answers = question.getAnswers();
        for (int i = 1; i <= answers.length; i++) {
            builder.append(i).append(": ").append(answers[i - 1]).append("\n");
        }

        questionNumber++;

        return builder.toString();
    }

    public String printResult() {
        return statistics.printResult();
    }

    public void checkAnswer(int answer) {
        boolean result = questions[questionNumber - 1].isValidAnswer(answer);
        statistics.addResult(questionNumber - 1, result);
    }
}
