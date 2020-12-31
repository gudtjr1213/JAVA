package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args)
	{
		// 1 ~ 6 총 6개의 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random() * 6) + 1;
		
		if(rNum == 1)
		{
			System.out.println("치킨");
		}
		else if (rNum == 2)
			System.out.println("피자");
		else if (rNum == 3)
			System.out.println("햄버거");
		else if (rNum == 4)
			System.out.println("라면");
		else if (rNum == 5)
			System.out.println("족발");
		else
			System.out.println("수육");
	} 
}
