package com.week2;
import java.util.*;

public class q10 {
	 public static void main(String[] asrg){  
		 Scanner input=new Scanner(System.in);   
		 System.out.print("Input number 1 : ");     
		 int x=input.nextInt();   
		 System.out.print("Input number 2 : ");     
		 int y=input.nextInt();     
		 System.out.print("Input number 3 : ");     
		 int z=input.nextInt();        //find the max   
		 int[] arr = {x,y,z};
		 int max = arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i-1]<arr[i]) {
				 max=arr[i];
			 }
		 }
		 System.out.println("Max : "+ max);  
		 }  
}

