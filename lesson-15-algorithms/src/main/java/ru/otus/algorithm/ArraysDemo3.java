package ru.otus.algorithm;

import java.util.Arrays;

public class ArraysDemo3 {
	static int[] f() {
		int[] a = {1, 2, 42};
		return a;
	}

	static void g(int[] x) {
		x[1] += 1;
		x = new int[3];
		x[2] = 7;
	}

	public static void main(String ... args) {
		int[] a = f();
		g(a);
		System.out.println(Arrays.toString(a));
	}
}
