package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/* 스캐너로 정수값 하나 입력받고
		 * 그 값이 홀수면 "홀수입니다."
		 * 짝수면 "짝수입니다."
		 */
		int num = scan.nextInt();
		String str = "짝수";
		
		if(num % 2 == 1)
			str = "홀수";
		else if (num == 0)
			str = "0";
		else if (num < 0)
			str = "음수";
		
		System.out.printf("%s입니다.", str);
		scan.close();
		
	}
}
