package com.week6;

class newClass1 extends Thread{
	private int[] array;
	
	public void setArray(int[] array) {
		this.array = array;
	}
	public void printTotal() {
		int sum = 0;
		for(int i:array) {
			sum = sum + i;
		}
		System.out.println("Sum : " + sum);
	}
	@Override
	public void run() {
		printTotal();
	}
}

public class q3 {
	public static void main(String[] args) {
		newClass1 nc1 = new newClass1();
		newClass1 nc2 = new newClass1();
		newClass1 nc3 = new newClass1();
		int[] class_A={23,45,12,67,34};
		nc1.setArray(class_A);
		int[] class_B={50,34,12,90,123,19};
		nc2.setArray(class_B);
		int[] class_C={45,34,78,99,22,55,66,77,90};
		nc3.setArray(class_C);
		long t1 = System.nanoTime();
		nc1.start();
		nc2.start();
		nc3.start();
		long t2 = System.nanoTime();
		System.out.println(nc1.getState());
		System.out.println("Spent Time : "+ (t2-t1)*Math.pow(10, -6));
		long t3 = System.nanoTime();
		nc1.setArray(class_A);
		nc1.start();
		nc1.setArray(class_B);
		nc1.start();
		nc1.setArray(class_C);
		nc1.start();
		long t4 = System.nanoTime();
		
		System.out.println("Spent Time : "+ (t4-t3)*Math.pow(10, -6));
	}
}
