package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		scan.close();
		String menu;
		
		switch(sNum)
		{
		case "a":
			menu = "a";
			break;
		case "2":
			menu = "b";
			break;
		case "3":
			menu = "c";
			break;
		case "4":
			menu = "d";
			break;
		case "5":
			menu = "e";
			break;
		default:
			menu = "f";
			break;
		}
	}
}
