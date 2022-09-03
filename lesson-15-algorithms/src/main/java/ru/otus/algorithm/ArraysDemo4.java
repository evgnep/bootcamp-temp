package ru.otus.algorithm;

import java.util.Arrays;

public class ArraysDemo4 {
	static void f(String ... args) {
		System.out.println(Arrays.toString(args));
	}

	static void g(String[] args) {
		System.out.println(Arrays.toString(args));
	}

	/*static void h(String... args, int ... args) {
	}*/


	public static void main(String ... args) {
		f("hello", "world");
		f();
		String[] a = new String[]{"a", "b"};
		f(a);

//		g("a", "b"); // ошибка

	}
}
