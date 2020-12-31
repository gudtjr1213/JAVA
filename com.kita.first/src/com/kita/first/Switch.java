package com.kita.first;

public class Switch {
	public static void main(String[] args)
	{
		// 1~6 총 6개의 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random() * 6 ) + 1;
		String menu;
		
		switch(rNum)
		{
			case 1:
				menu = "a";
				break;
			case 2:
				menu = "b";
				break;
			case 3:
				menu = "c";
				break;
			case 4:
				menu = "d";
				break;
			case 5:
				menu = "e";
				break;
			default:
				menu = "f";
				break;
		}
		System.out.printf("%s", menu);
	}
}
