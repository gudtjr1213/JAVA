package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args)
	{
		// 1월 ~ 12월
		// 3~5월 : 봄
		// 6~8월 : 여름
		// 9~11월 : 가을
		// 12~2월 : 겨울
		// n 월은 oo 입니다.
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		switch(num)
//		{
//			case 3: case 4: case 5:
//				System.out.printf("%d월은 봄입니다.",num);
//				break;
//			case 6: case 7: case 8:
//				System.out.printf("%d월은 여름입니다.",num);
//				break;
//			case 9: case 10: case 11:
//				System.out.printf("%d월은 가을입니다.",num);
//				break;
//			case 12: case 1: case 2:
//				System.out.printf("%d월은 겨울입니다.",num);
//				break;
//		}
//		
		if (num == 3 || num == 4 || num == 5)
		{
			System.out.printf("%d월은 봄입니다.",num);
		}
		else if (num == 6 || num == 7 || num == 8)
			System.out.printf("%d월은 여름입니다.",num);
		else if (num == 9 || num == 10 || num == 11)
			System.out.printf("%d월은 가을입니다.",num);
		else if (num == 12 || num == 1 || num == 2)
			System.out.printf("%d월은 겨울입니다.",num);
		else
			System.out.println("잘못입력하셨습니다.");
		
	}
}
