package com.kita.first.level3;

import java.util.Scanner;

public class ScanNum {
	public String inputNumString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String str = scan.next();
		scan.close();
		return str;
	}
	public void printMsg(int num)
	{
		if(num == 0)
		{
			System.out.println("잘못 입력했습니다.");
		}
		else
		{
			System.out.println("입력한 숫자 : " + num);
		}
	}
}
