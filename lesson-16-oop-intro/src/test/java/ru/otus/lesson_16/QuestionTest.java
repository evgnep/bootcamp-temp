package ru.otus.lesson_16;

import org.junit.jupiter.api.Test;
import ru.otus.lesson_16.models.Question;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    void testMain() {
        Question question = new Question("test question?", new String[]{"ans1", "ans2", "ans3"}, 2);

        assertEquals("test question?", question.getQuestion());

        String[] expectedAnswers = new String[]{"ans1", "ans2", "ans3"};

        String[] answers = question.getAnswers();

        assertEquals(expectedAnswers.length, answers.length);

        for (int i = 0; i < answers.length; i++) {
            assertEquals(expectedAnswers[i], answers[i]);
        }
        assertFalse(question.isValidAnswer(1));
        assertFalse(question.isValidAnswer(3));
        assertTrue(question.isValidAnswer(2));
    }
}

