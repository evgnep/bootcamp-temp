package ru.otus.algorithm;

import java.util.TreeMap;

public class TreeDemo {
	public static void main(String ... args) {
		var t = new TreeMap<Integer, String>();

		t.put(15, "Strange");
		t.put(20, "Hello");
		t.put(10, "World");
		System.out.println(t);

		t.remove(15);
		t.remove(11); // ничего не сделает

		System.out.println(t.containsKey(15));
	}
}
