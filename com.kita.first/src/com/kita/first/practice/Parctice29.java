package com.kita.first.practice;

import java.util.Scanner;

public class Parctice29 {
	public static void main(String[] args)
	{
		System.out.println("숫자야구게임 시작!");
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		int str;
		int ball;
		
		for(int i=0; i<rArr.length; i++)
		{
			int num = (int)(Math.random() * 10);
			rArr[i] = num;
			for(int z=0; z<i; z++)
			{
				if(rArr[i]==rArr[z])
				{
					i--;
					break;
				}
			}
		}
		
		while(true)
		{
			str = 0;
			ball = 0;
			for(int n=0; n<LEN; n++)
			{
				System.out.printf("값%d : ", n+1);
				int num1 = scan.nextInt();
				myArr[n] = num1;
				for(int z=0; z<n; z++)
				{
					if(myArr[n]==myArr[z])
					{
						System.out.println("중복된 숫자입니다.");
						n--;
						break;
					}
				}
				
			}
			for(int x=0; x<LEN; x++)
			{
				for(int i=0; i<LEN; i++)
				{
					if(rArr[x] == myArr[i])
						str++;
					else
						ball++;
				}
			}
			System.out.printf("s : %d, b : %d, o : %d", str,ball,(LEN-str)-ball);
			if(rArr == myArr)
			{
				System.out.print("End");
				break;
			}
		}
		scan.close();
	}
}
