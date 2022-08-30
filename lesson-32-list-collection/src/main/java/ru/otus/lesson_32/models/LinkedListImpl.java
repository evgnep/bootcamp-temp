package ru.otus.lesson_32.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl<T> implements List<T> {

    private ListNode<T> head;
    private ListNode<T> tail;
    private int size = -1;

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public boolean isEmpty() {
        return size < 0;
    }

    @Override
    public boolean add(T item) {
        // TODO
        return true;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = -1;
    }

    @Override
    public T get(int index) {
        // TODO
        return null;
    }

    @Override
    public T set(int index, T item) {
        // TODO
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private ListNode<T> current;

        LinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current.hasNext();
        }

        @Override
        public T next() {
            ListNode<T> next = current.getNext();
            current = next;
            return current.getItem();
        }
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
