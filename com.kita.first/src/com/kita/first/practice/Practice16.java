package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args)
	{
		
		Scanner sacn = new Scanner(System.in);
		int num = (int)(Math.random() * 3) +1 ;
		System.out.printf("%d", num);
		String menu;
		
		do
		{
		if(num == 1)
		{
			menu = "치킨";
			System.out.printf("%s", menu);
		}
		else if(num == 2)
		{
			menu = "피자";
			System.out.printf("%s", menu);
		}
		else
		{
			menu = "햄버거";
			System.out.printf("%s", menu);
		}
		}while(true);
	}
}
