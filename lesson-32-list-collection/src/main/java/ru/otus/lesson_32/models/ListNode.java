package ru.otus.lesson_32.models;

public class ListNode<T> {
    private T item;
    private ListNode<T> next;
    private ListNode<T> previous;

    public ListNode(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean hasNext() {
        return next != null;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }
}
