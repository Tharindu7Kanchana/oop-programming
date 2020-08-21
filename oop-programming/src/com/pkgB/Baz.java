package com.pkgB;

import com.pkgA.*;

public class Baz {
	public static void main (String [] args) {
		foo f = new foo ();
		System.out.print(" " + f.a);
		System.out.print(" " + f.b);
		System.out.print(" " + f.c);
		}
}
