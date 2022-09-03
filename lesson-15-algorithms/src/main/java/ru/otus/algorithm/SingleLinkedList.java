package ru.otus.algorithm;

public class SingleLinkedList {
	private static class Item {
		String value;
		Item next;
	}

	private Item top;

	void add(String e) {

	}

	void print() {

	}

	int size() {
		return 0;
	}

	public static void main(String ... args) {
		var list = new SingleLinkedList();
		list.add("Hello");
		list.add("World");
		list.print();
	}
}
