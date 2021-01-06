package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args)
	{
//		점수를 입력해 주세요: (0~100)
//		90점 이상 A
//		80점 이상 B
//		70점 이상 C
//		나머지는 D입니다. ( +, - 없다) 
//		 		
//		100 초과면 잘못 입력하였습니다.
//
//		일의 자리 수가 7점 이상이면 +
//		일의 자리 수가 3점 이하이면 -
//		 		
//		예를 들어, 95점: A, 97점: A+, 83점: B-
// Integer.parseInt();
		System.out.print("점수를 입력해 주세요: (0~100) ");
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		scan.close();
		 
		if(num >= 90 && num <= 100)
		{
			if(num >= 97)
				System.out.println("A+");
			else if(num <= 93)
				System.out.println("A-");
			else
				System.out.println("A");
		}
		else if(num >= 80 && num <= 90)
		{
			if(num >= 87)
				System.out.println("B+");
			else if(num <= 83)
				System.out.println("B-");
			else
				System.out.println("B");
		}
		else if(num >= 70 && num <= 80)
		{
			if(num >= 77)
				System.out.println("C+");
			else if(num <= 73)
				System.out.println("C-");
			else
				System.out.println("C");
		}
		else if (num > 100 || num < 0)
		{
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		else
			System.out.println("D");	
	}
}
