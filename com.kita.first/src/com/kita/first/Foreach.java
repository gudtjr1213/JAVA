package com.kita.first;

public class Foreach {
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		// 2, 4, 6 ,8 ,10, 12, 14 ,16, 18, 20
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (i+1) * 2;
			System.out.printf("%d ", arr[i]);
		}
		
		for(int val : arr)
		{
			System.out.println(val);
		}
	}
}
