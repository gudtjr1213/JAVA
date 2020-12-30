package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args)
	{
		/*
		 * 수학 응시 유형을 입력해주세요 : (가/나)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해 주세요 : ");
		String str = scan.next();
		if("가".equals(str))
		{
			System.out.print("점수를 입력해주세요 : ");
			int num = scan.nextInt();
			if (num < 60)
			{
				System.out.println("평균 미만입니다.");
			}
			else if(num == 60)
				System.out.println("평균 입니다.");
			else
				System.out.println("평균 초과입니다.");
		}	
		if("나".equals(str))
		{
			System.out.print("점수를 입력해주세요 : ");
			int num = scan.nextInt();
			if (num < 70)
			{
				System.out.println("평균 미만입니다.");
			}
			else if(num == 70)
				System.out.println("평균 입니다.");
			else
				System.out.println("평균 초과입니다.");
		scan.close();	
		}
	}
}
