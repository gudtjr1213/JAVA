package com.kita.first;

public class Array1 {
	public static void main(String[] args) 
	{
		int[] arr1 = new int[4];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;		
		System.out.println(arr1[0]);
		
		String[] arr2 = new String[3];
		System.out.println(arr2[0]);
		
		int[] arr4 = {1,4,5,2};
		
		int[] arr5;
		arr5 = new int[] {1,4,5,2};
		
		int[] arr6 = new int[5];
		
		for(int i=0;i<arr6.length; i++)
		{
			arr6[i] = i + 1;
			System.out.printf("%d\t",arr6[i]);
		}
	}
}
