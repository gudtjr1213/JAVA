package com.kita.first.practice;

public class Practice11 {
	public static void main(String[] args)
	{
		int dan = 4;
		int temp;
		
		for(int i=1;i<10;i++)
		{
			temp = dan * i;
			System.out.printf("%d * %d = %d\n", dan, i, temp);
		}
	}
}
