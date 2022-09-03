package ru.otus.algorithm;

import java.util.Arrays;

public class ArraysDemo1 {
	static void create() {
		int[] a = {10, 11};

		int[] b = new int[3];
	}

	public static void main(String ... args) {
		int[] a = {10, 11, 12, 13, 14};

		System.out.println(a.length);

		for (int i = 0;  i < a.length; ++i) {
			System.out.println(a[i]);
		}

		System.out.println("------------------------");

		int[] b = a;
		b[0] += 1;
		b[1] = 42;
		b[2] = b[3] + b[4];

		for (int v : a) {
			System.out.println(v);
		}

		System.out.println("------------------------");

		System.out.println(a);
		System.out.println(Arrays.toString(a));
	}
}
