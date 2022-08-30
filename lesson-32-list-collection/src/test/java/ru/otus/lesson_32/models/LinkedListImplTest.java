package ru.otus.lesson_32.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListImplTest {

    private List<Integer> array;

    @BeforeEach
    void init() {
        array = new LinkedListImpl<>();
    }

    @Test
    void testInsert() {
        assertEquals(0, array.size());
        assertNull(array.get(0));
        assertNull(array.get(1));
        assertTrue(array.isEmpty());

        array.add(5);

        assertEquals(1, array.size());
        assertFalse(array.isEmpty());
        assertEquals(5, array.get(0));
        assertNull(array.get(1));

        array.clear();

        assertEquals(0, array.size());
        assertNull(array.get(0));
        assertNull(array.get(1));

        assertTrue(array.isEmpty());
    }

    @Test
    void testIterator() {
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);

        for (Integer item : array) {
            System.out.println(item);
        }
    }
}


