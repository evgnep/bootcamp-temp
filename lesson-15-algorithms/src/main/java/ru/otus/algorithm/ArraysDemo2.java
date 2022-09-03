package ru.otus.algorithm;

import java.util.Arrays;

public class ArraysDemo2 {
	public static void main(String ... args) {
		String[] a = {"hello", "world"};
		CharSequence[] b = a;
		b[0] = "qwer";
		//b[1] = new StringBuilder();

		CharSequence[] c = {"zx", "cv"};
		c[0] = new StringBuilder().append("a=").append(42);

		System.out.println(Arrays.toString(c));
	}
}
