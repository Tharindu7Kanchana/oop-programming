package com.week5;

public class q8 {
	public static int sum(int[] arr) throws ArrayIndexOutOfBoundsException {
		if(arr.length > 10) {
			throw new ArrayIndexOutOfBoundsException("Array is too large");
		}
		int sum = 0;
		for(int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void functionTest(int[] arr) throws ArrayIndexOutOfBoundsException{
		System.out.println(sum(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,9,7,4,5,7,5};
		int[] arr1 = {1,2,3,5,6,9,7,4,5};
		try {
			functionTest(arr);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
	}
}